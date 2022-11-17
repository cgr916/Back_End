package com.atguigu.cloud.test;

import com.atguigu.cloud.mapper.MemberMapper;
import com.atguigu.cloud.po.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: cgr
 * @date: 2022/8/5 - 15:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {
    @Autowired
    private DataSource dataSource;

    @Resource
    private MemberMapper memberMapper;

    private Logger logger = LoggerFactory.getLogger(MybatisTest.class);

    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        logger.debug(connection.toString());
    }

    @Test
    public void testMapper(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("123456");
//        Member member = new Member(null, "Tom",  "tomy", encode, "tom@163.com", 1, 1, "tomy", "3712939", 2);
        Member member = new Member(null, "Jack", "jacky", encode,  "jack@163.com", 1, 1, "jacky", "3712546", 2);

        memberMapper.insert(member);
    }
}
