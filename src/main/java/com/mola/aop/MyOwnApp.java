package com.mola.aop;

import org.springframework.stereotype.Service;

/**
 * 面向切面编程旨在让一组类共享相同的行为，比如这是我私人定制的类但我却可以通过注解享用切面内提供的服务
 */
@Service
public class MyOwnApp {
    @Action(name = "这是我私人定制的app")
    public void self(){
    }
}
