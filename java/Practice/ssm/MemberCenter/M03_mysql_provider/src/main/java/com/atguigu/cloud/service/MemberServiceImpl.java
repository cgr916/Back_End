package com.atguigu.cloud.service;

import com.atguigu.cloud.api.MemberService;
import com.atguigu.cloud.mapper.MemberMapper;
import com.atguigu.cloud.po.Member;
import com.atguigu.cloud.po.MemberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/8/5 - 20:25
 */
@Transactional(readOnly = true)
@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public Member getMemberByLoginAcct(String loginacct) {
        MemberExample memberExample = new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();
        criteria.andLoginacctEqualTo(loginacct);
        List<Member> members = memberMapper.selectByExample(memberExample);
        if(members.size() == 0) return null;
        return members.get(0);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW,
                   rollbackFor = Exception.class,
                   readOnly = false)
    @Override
    public Boolean registerMember(Member member) {
        try {
            memberMapper.insertSelective(member);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
