package com.mola.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                =new AnnotationConfigApplicationContext(EventConfig.class);

        MyPublisher publisher=annotationConfigApplicationContext.getBean(MyPublisher.class);
        publisher.publish("哈哈哈哈哈哈哈哈");
    }
}
