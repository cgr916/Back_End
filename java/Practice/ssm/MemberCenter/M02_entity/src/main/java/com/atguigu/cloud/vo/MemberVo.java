package com.atguigu.cloud.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: cgr
 * @date: 2022/8/7 - 16:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVo {
    private String loginacct;
    private String username;
    private String userpswd;
    private String email;
    private String phoneNum;
    private String code;
}
