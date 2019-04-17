package com.mola.interf;

import org.springframework.stereotype.Service;

@Service
public class MyClassOne implements MyInterface {

    @Override
    public void start() {
        System.out.println("one");
    }
}
