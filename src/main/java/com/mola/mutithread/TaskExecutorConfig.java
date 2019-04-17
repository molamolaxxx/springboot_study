package com.mola.mutithread;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.config.Task;

import java.util.concurrent.Executor;

@Configuration
@ComponentScan("com.mola.mutithread")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer{
    ThreadPoolTaskExecutor taskExecutor;
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor=new ThreadPoolTaskExecutor();
        this.taskExecutor=taskExecutor;

        //线程池维护线程的最少数量
        taskExecutor.setCorePoolSize(50);
        //线程池维护线程的最大数量
        taskExecutor.setMaxPoolSize(100);
        //缓冲队列
        taskExecutor.setQueueCapacity(250);
        taskExecutor.setKeepAliveSeconds(3000);
        //初始化
        taskExecutor.initialize();

        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }

    public void shutdown(){
        taskExecutor.shutdown();
    }
}
