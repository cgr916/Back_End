package com.atguigu.cloud.handler;

import com.atguigu.cloud.api.MemberService;
import com.atguigu.cloud.po.Member;
import com.atguigu.cloud.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: cgr
 * @date: 2022/8/5 - 20:22
 */
@RestController
public class ProviderHandler {

    @Resource
    private MemberService memberService;


    @RequestMapping("/provider/mysql/getMemberByLoginAcct/by")
    ResultEntity<Member> getMemberByLoginAcct(@RequestParam("loginacct") String loginacct) {
        try {
            Member member = memberService.getMemberByLoginAcct(loginacct);
            return ResultEntity.successWithData(member);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping("/provider/mysql/registerMember")
    ResultEntity<String> registerMember(@RequestBody Member member){
        try {
                memberService.registerMember(member);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }
    }

}
