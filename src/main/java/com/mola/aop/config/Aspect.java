package com.mola.aop.config;

import org.aspectj.lang.annotation.Before;

public class Aspect {

    public void before(){
        System.out.println("before-do");
    }

    public void after(){
        System.out.println("after-do");
    }
}
