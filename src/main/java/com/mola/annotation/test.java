package com.mola.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = Config.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class test {
    @Autowired
    MyService service;

    @Test
    public void run(){
        service.output();
    }
}
