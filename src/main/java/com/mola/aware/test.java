package com.mola.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//加上这一句之后，自动装配有效,目的：使测试在spring环境下进行
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class test {
    /*public static void main(String[] args){
        //spring容器
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        AwareService awareService=context.getBean(AwareService.class);
        //输出文件内容
        awareService.outputResult();
        //打印出bean的名称
        System.out.println(awareService.getBeanName());
    }*/
    @Autowired
    AwareService awareService;

    @Test
    public void testAware(){
        awareService.outputResult();
    }
}
