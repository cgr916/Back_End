package com.atguigu.pro2;

/**
 * @author: cgr
 * @date: 2022/3/30 - 22:47
 */
public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    // 添加客户
    // 如果超出初始化时的列表容量，返回 false
    // 如果未超出初始化时列表容量，返回 true 并将需要添加的客户添加至客户列表中
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) return false;

        customers[total++] = customer;
        return true;
    }

    // 替换客户 根据指定的索引值处的客户列表的客户进行替换
    // 如果索引值正常，返回 true
    // 如果索引值不正常，返回false
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) return false;

        customers[index] = cust;
        return true;
    }

    // 删除客户 根据指定的索引值删除客户
    // 如果索引合法，返回 true
    // 如果索引非法 返回 false
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) return false;

        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }

        customers[--total] = null;

        return true;
    }

    // 获取所有用户
    // 返回客户里列表中的所有客户
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    // 获取客户总人数
    // 返回客户列表中的总人数
    public int getTotal() {
        return total;
    }

    // 获取指定索引处的客户
    // 如果索引合法，返回指定的客户信息
    // 如果索引非法，返回 null
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) return null;

        return customers[index];
    }
}
