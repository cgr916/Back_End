package com.atguigu.crowd.service.api;

import com.atguigu.crowd.entity.Admin;

import java.util.List;

/**
 * @author: cgr
 * @date: 2022/5/26 - 21:53
 */
public interface AdminService {
    void saveAdmin(Admin admin);

    List<Admin> getAll();

    Admin getAdminByLoginAcc(String loginName, String loginPswd);

}
