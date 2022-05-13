package com.atguigu.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author: cgr
 * @date: 2022/4/10 - 20:55
 */
@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotations {
    MyAnnotation[] value();
}
