package com.atguigu.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: cgr
 * @date: 2022/5/23 - 22:45
 */
public class SqlSessionUtil {
    private static InputStream resourceAsStream = null;

    public static SqlSession getSqlSession(boolean autoCommit){
        SqlSession sqlSession = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = sqlSessionFactory.openSession(autoCommit);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            return sqlSession;
        }
    }

}
