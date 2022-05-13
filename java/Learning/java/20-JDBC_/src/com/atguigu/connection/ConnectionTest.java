package com.atguigu.connection;

import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author: cgr
 * @date: 2022/5/8 - 15:04
 */
public class ConnectionTest {

    @Test
    public  void testConnect_1() throws SQLException {
        // 获取 driver 实现类对象
        Driver driver = new com.mysql.cj.jdbc.Driver();
        // 相关信息
        String url = "jdbc:mysql://localhost:3306/test";//数据库url
        Properties info = new Properties();//用户名和密码
        info.setProperty("user","root");
        info.setProperty("password","16907cgr");

        Connection conn = driver.connect(url,info);

        System.out.println(conn);
    }

    @Test
    public  void testConnect_2() throws Exception{
        Class calzz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) calzz.newInstance();

        String url = "jdbc:mysql://localhost:3306/test";//数据库url
        Properties info = new Properties();//用户名和密码
        info.setProperty("user","root");
        info.setProperty("password","16907cgr");

        System.out.println(driver.connect(url, info));
    }

    @Test
    public  void testConnect_3() throws Exception{
        Class calzz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) calzz.newInstance();

        String url = "jdbc:mysql://localhost:3306/test";//数据库url
//        Properties info = new Properties();//用户名和密码
//        info.setProperty("user","root");
//        info.setProperty("password","16907cgr");
        String user = "root";
        String password = "16907cgr";

        DriverManager.registerDriver(driver);
        Connection conn = DriverManager.getConnection(url,user,password);

        System.out.println(conn);
    }

    @Test
    public  void testConnect_4() throws Exception{
        // 加载 com.mysql.cj.jdbc.Driver 类时也同时注册了driver
        Class.forName("com.mysql.cj.jdbc.Driver");
//        Driver driver = (Driver) calzz.newInstance();

        String url = "jdbc:mysql://localhost:3306/test";//数据库url
        String user = "root";
        String password = "16907cgr";

//        DriverManager.registerDriver(driver);
        Connection conn = DriverManager.getConnection(url,user,password);

        System.out.println(conn);
    }


    @Test
    public  void testConnect_5() throws Exception{
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");

        Properties pros = new Properties();
        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClass");

        Class.forName(driverClass);

        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println(conn);

    }

    @Test
    public void testStr(){
        String s1 = "";
        String s2 = "abc";
        System.out.println(s2.contains(s1));
        System.out.println(s1 == null);
        System.out.println(s1 == "");
        System.out.println(s1 == " ");
        System.out.println(s1.isEmpty());
    }
}
