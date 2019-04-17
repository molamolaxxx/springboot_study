package com.mola.aop.config;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(value ="classpath:ApplicationContext.xml" )
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {

    @Autowired
    MyService myService;

    @org.junit.Test
    public void aopXmlConfig(){
        //调用service2
        /**
         * output:
         before-do
         service2
         after-do
         */
        myService.service2();

    }
}
