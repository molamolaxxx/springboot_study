package com.mola.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void doLoopTime(){
        System.out.println(dateFormat.format(new Date()));
    }

    @Scheduled(cron = "50 47 21 ? * *")
    public void fixTimeExecution(){
        System.out.println(dateFormat.format(new Date()));
    }
}
