package com.atguigu.crowd.test;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.mapper.AdminMapper;
import com.atguigu.crowd.service.api.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

/**
 * @author: cgr
 * @date: 2022/5/25 - 10:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml","classpath:spring-persist-tx.xml"})
public class CrowdTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminService adminService;

    @Test
    public void testConnect() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    public void testInsertAdmin(){
        Admin admin = new Admin(null, "Jerry", "11214325", "jerryMouse", "11231@qq.com", new Date());
        System.out.println(admin);
        int c = adminMapper.insert(admin);
        System.out.println("受影响的行数："+c);
    }

    @Test
    public void testLog(){
        Logger logger = LoggerFactory.getLogger(CrowdTest.class);

        logger.debug("Hello debug log");
        logger.info("Hello info log");
        logger.warn("Hello warn log");
        logger.error("Hello error log");
    }

    @Test
    public void testTx(){
        Admin admin = new Admin(12, "Jerry001", "1121435346344325", "jerryMouse", "11231@qq.com", new Date());
        adminService.saveAdmin(admin);
        throw new RuntimeException("运行时异常！！！");
    }

    @Test
    public void testCode(){
        int i = 5/2;
        System.out.println("i的值为:" + i);
    }

}
