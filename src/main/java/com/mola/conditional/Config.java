package com.mola.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    @Conditional(LinuxCondition.class)
    public ListCommandService showLinux(){
        return new LinuxCommand();
    }

    @Bean
    @Conditional(WindowsCondition.class)
    public ListCommandService showWin(){
        return new WindowsCommand();
    }
}
