package com.atguigu.pool;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author: cgr
 * @date: 2022/5/11 - 15:37
 */
public class DruidTest {

    @Test
    public void test(){
        getConnection();
    }

    public void getConnection(){
        try {
            Properties properties = new Properties();

            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
            properties.load(is);
            DataSource ds = DruidDataSourceFactory.createDataSource(properties);

            Connection connection = ds.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
