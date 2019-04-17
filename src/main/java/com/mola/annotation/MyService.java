package com.mola.annotation;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void output(){
        System.out.println("这是我的service");
    }
}
