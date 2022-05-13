package com.atguigu.generic;

import java.util.*;

/**
 * @author: cgr
 * @date: 2022/4/12 - 16:52
 */
public class MyGenericClass<T> {
    ArrayList arrayList = new ArrayList();
    String desc;
    int serialId;
    // 可以将 T 看作为一个 “类”;
    T mgcId;

    public T getMgcId() {
        return mgcId;
    }

    public void setMgcId(T mgcId) {
        this.mgcId = mgcId;
    }

    public <E> List genericMethod(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        HashSet<String> strings = new HashSet<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }

    public void  test(){
        List<String> list1 = null;
            ArrayList<String> list2 = null;
        list1 = list2;
    }

}
