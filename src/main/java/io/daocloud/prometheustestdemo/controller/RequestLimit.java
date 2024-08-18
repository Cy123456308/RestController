package io.daocloud.prometheustestdemo.controller;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
//注解对象的类型
@Retention(RetentionPolicy.RUNTIME)
//注解对象起效时间
@Documented
//注解对象出现在Javadoc文档中
@Inherited
//注解对象会被继承
public @interface RequestLimit {
    int count() default Integer.MAX_VALUE;

    long time() default 1000;
}
