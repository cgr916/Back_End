package com.atguigu.prepareStatement;

import com.atguigu.bean.Customers;
import com.atguigu.bean.Order;
import com.atguigu.util.JdbcUtil;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;

/**
 * @author: cgr
 * @date: 2022/5/10 - 20:47
 */
public class OrderQuery {
    public static void main(String[] args) {
        OrderQuery orderQuery = new OrderQuery();
        String sql = "select order_id orderId,order_name orderName,order_date orderDate from `order` where order_id = ?";
        Order order = (Order) orderQuery.commonOrderQuery(sql, 1);
        System.out.println(order);
    }

    @Test
    public void test() throws Exception {
        try {
            Connection connection = JdbcUtil.connectSQL();

            String sql = "select order_id,order_name,order_date from `order` where order_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1,1);

//            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int id = (int) resultSet.getObject(1);
                String name = (String) resultSet.getObject(2);
                Date date = (Date) resultSet.getObject(3);

                Order order = new Order(id,name,date);
                System.out.println(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JdbcUtil.connectSQL();
        }

    }

    //针对Order表 单条
    public Object commonOrderQuery(String sql, Object...args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JdbcUtil.connectSQL();
//            "select order_id,order_name,order_date from `order` where order_id = ?"
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0;i < args.length;i++){
                preparedStatement.setObject(i+1,args[i]);
            }

            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            if(resultSet.next()){
                Order order = new Order();
                for (int i = 0;i<columnCount;i++){
                    Object res = resultSet.getObject(i + 1);
                    String cName = metaData.getColumnLabel(i+1);

                    Field field = Order.class.getDeclaredField(cName);
                    field.setAccessible(true);
                    field.set(order,res);
                }
                return order;
            }


        } catch (SQLException | NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.closeResource(connection,preparedStatement);
        }
        return null;
    }

    //针对不同表 单条
     public <T> T commonQuery(Class<T> clazz,String sql,Object...args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JdbcUtil.connectSQL();
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0;i < args.length;i++){
                preparedStatement.setObject(i+1,args[i]);
            }

            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            if(resultSet.next()){
//                Order order = new Order();//
//                T obj = (T)new Object();
                T obj = clazz.newInstance();
                for (int i = 0;i<columnCount;i++){
                    Object res = resultSet.getObject(i + 1);
                    String cName = metaData.getColumnLabel(i+1);

                    Field field = clazz.getDeclaredField(cName);
                    field.setAccessible(true);
                    field.set(obj,res);
                }
                return obj;
            }
        } catch (SQLException | NoSuchFieldException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.closeResource(connection,preparedStatement);
        }
        return null;
    }

    @Test
    public void test1(){
        String sql = "select id,name,email from customers where id = ?";
        Customers customers = commonQuery(Customers.class, sql, 12);
        System.out.println(customers);
    }
}
