package com.mola.EL表达式和资源调用;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        //spring容器
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ElConfig.class);
        //bean
        ElConfig config=applicationContext.getBean(ElConfig.class);
        //打印注入变量名
        config.outputResource();
    }
}
