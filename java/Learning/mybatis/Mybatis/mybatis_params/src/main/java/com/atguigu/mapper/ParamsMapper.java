package com.atguigu.mapper;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author: cgr
 * @date: 2022/5/23 - 22:03
 */
public interface ParamsMapper {
    int insertUser(@Param("name") String name,@Param("password") String password,@Param("address") String address,@Param("phone") String phone);
    void updateUserById(int id);
    void deleteUserById(int id);
    User getUserById(int id);

}
