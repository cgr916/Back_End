package com.atguigu.intf;

/**
 * @author: cgr
 * @date: 2022/11/15 - 23:25
 */
public interface ParentIntf {
    default public int test2() {
        System.out.println("test2-parent");
        return 1;
    }
}
