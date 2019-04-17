package com.mola.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解的被拦截类
 */
@Service
public class AnnotationService {

    @Action(name = "AnnotationService.class.add()")
    public void add(){
    }
}
