package com.atguigu.prepareStatement;

import com.atguigu.bean.Customers;
import com.atguigu.util.JdbcUtil;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author: cgr
 * @date: 2022/5/8 - 17:26
 */
public class PrepareStatementTest {

    public void  alterSqlData(String sql,Object obj){

    }

    @Test
    // 测试添加
    public  void testInsert() throws Exception {
            Connection conn = JdbcUtil.connectSQL();

            // 增
            String sql = "INSERT INTO customers(`name`,email,birth) VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, "哪吒");
            ps.setString(2, "nezha@163.com");
            ps.setString(3, "652-01-01");

            ps.execute();

            JdbcUtil.closeResource(conn,ps);
    }

    // 测试查询
    @Test
    public  void  testQuery() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JdbcUtil.connectSQL();
            String sql = "select id,name,email,birth from customers where id = ? ";
            ps = conn.prepareStatement(sql);
            ps.setObject(1,1);

            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                Date birth = resultSet.getDate(4);

                Customers customers = new Customers(id, name, email, birth);
                System.out.println(customers);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.closeResource(conn,ps);
        }

    }
}
