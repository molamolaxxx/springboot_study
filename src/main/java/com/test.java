package com;

import com.mola.aop.AnnotationService;
import com.mola.aop.AopConfig;
import com.mola.aop.MethodService;
import com.mola.aop.MyOwnApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args){
        //容器
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AopConfig.class);
        //获得bean
        AnnotationService annotationService=context.getBean(AnnotationService.class);
        MethodService methodService=context.getBean(MethodService.class);

        //实验部分
        //annotationService.add();
        MyOwnApp myOwnApp=context.getBean(MyOwnApp.class);
        myOwnApp.self();
        //关闭容器
        context.close();
    }

}
