package com.mola.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class test {
    public static void main(String[] args){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);

        //多实例bean
        ProtoService p1=applicationContext.getBean(ProtoService.class);
        ProtoService p2=applicationContext.getBean(ProtoService.class);
        //单例bean
        SingleService s1=applicationContext.getBean(SingleService.class);
        SingleService s2=applicationContext.getBean(SingleService.class);
        //Ture
        System.out.println(s1==s2);
        //False
        System.out.println(s1!=s2);

    }
}
