package com.atguigu.crowd.service.impl;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.entity.AdminExample;
import com.atguigu.crowd.exception.LoginException;
import com.atguigu.crowd.mapper.AdminMapper;
import com.atguigu.crowd.service.api.AdminService;
import com.atguigu.crowd.util.CrowdConstant;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/5/26 - 21:54
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;


    @Override
    public void saveAdmin(Admin admin) {
        adminMapper.insert(admin);
//        System.out.println(1/0);
        System.out.println("保存管理员");
    }

    @Override
    public List<Admin> getAll() {
        List<Admin> admins = adminMapper.selectByExample(new AdminExample());
        return admins;
    }

    @Override
    public Admin getAdminByLoginAcc(String loginName, String loginPswd) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUsrAcctEqualTo(loginName);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if(admins == null || admins.size() == 0){
            throw new LoginException(CrowdConstant.LOGIN_FAILED);
        }else if(admins.size() > 1){
            throw new RuntimeException(CrowdConstant.LOGIN_NOT_UNIQUE);
        }
        Admin admin = admins.get(0);
        if(admin == null){
            throw new LoginException(CrowdConstant.LOGIN_ACC_IS_NULL);
        }
        String pswd = admin.getUsrPswd();
        System.out.println(pswd);
        System.out.println(loginPswd);
        if(!pswd.equals(loginPswd)){
            throw new LoginException(CrowdConstant.LOGIN_PSWD_ERR);
        }
        return admin;
    }
}