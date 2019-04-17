package com.mola.EL表达式和资源调用;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Configuration
@ComponentScan("com.mola.EL表达式和资源调用")
@PropertySource("classpath:com/mola/EL表达式和资源调用/test.properties")
public class ElConfig {

    @Value("hello world!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{ T(java.lang.Math).random() }")
    private double random;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${this.name}")
    private String name;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(random);
            System.out.println(testUrl.getURI());
            System.out.println(name);
            System.out.println(environment.getProperty("this.password"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
