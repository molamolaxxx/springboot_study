package com.mola.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ScheduleConfig.class);
        ScheduledTaskService service=context.getBean(ScheduledTaskService.class);

        //循环定时
        service.doLoopTime();
        //在某一时刻执行
        service.fixTimeExecution();
    }
}
