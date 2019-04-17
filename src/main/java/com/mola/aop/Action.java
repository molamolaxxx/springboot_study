package com.mola.aop;

import java.lang.annotation.*;

/**
 * 自定义action注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
