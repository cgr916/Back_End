package com.atguigu.util;

import com.atguigu.connection.ConnectionTest;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author: cgr
 * @date: 2022/5/8 - 17:42
 */
public class JdbcUtil {

    public static Connection connectSQL() throws IOException, ClassNotFoundException, SQLException {
            Connection conn = null;

            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");

            Properties pros = new Properties();
            pros.load(is);

            String user = pros.getProperty("user");
            String password = pros.getProperty("password");
            String url = pros.getProperty("url");
            String driverClass = pros.getProperty("driverClass");

            Class.forName(driverClass);

            conn = DriverManager.getConnection(url,user,password);
        return  conn;
    }

    public static void  closeResource(Connection conn, Statement ps){
        try {
            if(conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(ps != null) ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
