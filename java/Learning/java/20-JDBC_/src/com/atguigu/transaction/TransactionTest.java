package com.atguigu.transaction;

import com.atguigu.util.JdbcUtil;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author: cgr
 * @date: 2022/5/11 - 14:12
 */
public class TransactionTest {

    @Test
    public void test() {
        String sql1 = "update user_table set balance = balance-100 where user = ?";
        String sql2 = "update user_table set balance = balance+100 where user = ?";
        Connection connection = null;
        try {
            connection = JdbcUtil.connectSQL();
            connection.setAutoCommit(false);
            int res1 = update(connection, sql1, "AA");

            System.out.println(100/0);

            int res2 = update(connection, sql2, "BB");

            connection.commit();
            System.out.println("转账成功");
        } catch (Exception e) {
            try {
                System.out.println("转账异常");
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JdbcUtil.closeResource(connection,null);
        }
    }

    public int update(String sql,Object...args){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = JdbcUtil.connectSQL();
            ps = connection.prepareStatement(sql);
            for (int i = 0;i<args.length;i++){
                ps.setObject(i+1,args[i]);
            }
            return ps.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.closeResource(connection,ps);
        }
        return  0;
    }

    public int update(Connection conn,String sql,Object...args){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0;i<args.length;i++){
                ps.setObject(i+1,args[i]);
            }
            return ps.executeUpdate();
        }  catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.closeResource(null,ps);
        }
        return  0;
    }
}
