package com.mola.aop;

import org.springframework.stereotype.Service;

@Service
public class MethodService {
    public void add(){
        System.out.println("MethodService.class-->add()");
    }
}
