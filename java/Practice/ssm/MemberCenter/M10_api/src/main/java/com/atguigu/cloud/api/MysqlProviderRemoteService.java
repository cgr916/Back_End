package com.atguigu.cloud.api;

import com.atguigu.cloud.po.Member;
import com.atguigu.cloud.util.ResultEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: cgr
 * @date: 2022/8/5 - 20:16
 */
@FeignClient("member-mysql-provider")
public interface MysqlProviderRemoteService {

    @RequestMapping("/provider/mysql/getMemberByLoginAcct/by")
    ResultEntity<Member> getMemberByLoginAcct(@RequestParam("loginacct") String loginacct);

    @RequestMapping("/provider/mysql/registerMember")
    ResultEntity<Member> registerMember(@RequestBody Member member);


}
