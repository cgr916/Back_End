package com.atguigu.annotation;

import java.util.ArrayList;

/**
 * @author: cgr
 * @date: 2022/4/10 - 17:34
 */
public class AnnotationTest {
//    @Override

    @SuppressWarnings("unused")
    int num = 101;

    @SuppressWarnings({"unused","rawtypes"})
    ArrayList list = new ArrayList();

}
