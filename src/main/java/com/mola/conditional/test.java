package com.mola.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        ListCommandService service=context.getBean(ListCommandService.class);

        service.showListCommand();
    }
}
