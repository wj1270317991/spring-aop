package com.spring.aop.annotation;

import java.lang.annotation.*;

/**
 * Created by wangjun on 2018/12/19.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Demo {
    String name() default "";
}
