package com.atguigu.cloud.api;

import com.atguigu.cloud.po.Member;

/**
 * @author: cgr
 * @date: 2022/8/5 - 20:24
 */
public interface MemberService {
    Member getMemberByLoginAcct(String loginacct);
    Boolean registerMember(Member member);
}
