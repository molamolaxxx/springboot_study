package com.mola.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan("com.mola.schedule")
@Configuration
@EnableScheduling
public class ScheduleConfig {
}
