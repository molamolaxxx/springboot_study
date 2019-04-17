package com.mola.mutithread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

    public static void main(String[] args){
        long useThreadTime=0;
        long useTime=0;
        long maxTime;

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsynTaskService asynTaskService=context.getBean(AsynTaskService.class);
        TaskExecutorConfig taskExecutorConfig=context.getBean(TaskExecutorConfig.class);

        useThreadTime=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            asynTaskService.execute(i,System.currentTimeMillis());
        }

        useTime=System.currentTimeMillis()-useTime;
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println("执行:"+i);
        }
        useTime=System.currentTimeMillis()-useTime;
        System.out.println("不使用线程池用了:"+useTime+"毫秒");

        //关闭线程池
        taskExecutorConfig.shutdown();
        //关闭容器
        context.close();
    }
}
