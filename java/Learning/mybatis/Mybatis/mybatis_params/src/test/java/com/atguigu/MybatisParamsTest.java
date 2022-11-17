package com.atguigu;

import com.atguigu.mapper.ParamsMapper;
import com.atguigu.pojo.User;
import com.atguigu.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author: cgr
 * @date: 2022/5/24 - 11:04
 */
public class MybatisParamsTest {
    private SqlSession sqlSession = SqlSessionUtil.getSqlSession(true);
    private ParamsMapper mapper = sqlSession.getMapper(ParamsMapper.class);
    @Test
    public void testInsert(){
        mapper.insertUser("zjl", "4321412", "taiwan", "1818289839238");
        System.out.println("新增一条记录");
    }

    @Test
    public void testUpdate(){
        mapper.updateUserById(12);
        System.out.println("更改一条记录：id为 "+13);
    }

    @Test
    public void testDelete(){
        mapper.deleteUserById(11);
        System.out.println("删除一条记录：id为 "+11);
    }

    @Test
    public void testSelectById(){
        System.out.println("查询一条记录：id为 "+13);
        User user = mapper.getUserById(13);
        System.out.println(user);
    }
}
