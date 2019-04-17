package com.mola.aop.config;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void service1(){
        System.out.println("service1");
    }

    public void service2(){
        System.out.println("service2");
    }
}
