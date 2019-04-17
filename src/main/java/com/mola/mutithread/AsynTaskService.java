package com.mola.mutithread;

import com.sun.corba.se.impl.orbutil.closure.Future;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;


@Service
public class AsynTaskService {
    private long maxTime=0;
    private int total=0;
    private long startTime;

    @Async
    public void execute(int i,long time){
        if(time>maxTime)
            maxTime=time;
        //睡100毫秒
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("执行(ut):"+i);


        total++;
        if(total==99)
            System.out.println("使用线程用了:"+(System.currentTimeMillis()-startTime)+"毫秒");
        else if(total==1)
            startTime=time;
    }

    public long getMaxTime(){
        return this.maxTime;
    }

}
