package com.mola.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * aop配置文件
 * @ComponentScan　自动扫描
 */
@Configuration
@ComponentScan("com.mola.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
