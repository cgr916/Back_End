package com.atguigu.mapper;

import com.atguigu.pojo.User;

import java.util.List;

/**
 * @author: cgr
 * @date: 2022/5/23 - 11:27
 */
public interface UserMapper {

    int insertUser();
    void updateUser();
    void deleteUser();
    User getUserById();
    List<User> getAllUsers();
}
