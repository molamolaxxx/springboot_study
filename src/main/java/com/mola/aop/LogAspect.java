package com.mola.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 切面
 * @Aspect 申明切面
 * @Component　 注入容器
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.mola.aop.Action)")
    public void annotationPointCut(){
    }

    //在经过切点之后
    @Before("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        Method method=signature.getMethod();
        //获得method
        Action action=method.getAnnotation(Action.class);
        System.out.println("在切点之后的业务逻辑...参数:"+action.name());
    }

    //在经过切点之前
    @After("annotationPointCut()")
    public void before(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        Method method=signature.getMethod();
        //获得method
        Action action=method.getAnnotation(Action.class);
        System.out.println("在切点之前的业务逻辑...参数:"+action.name());
    }

    /*@Before("execution(*com.mola.aop.MethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        Method method=signature.getMethod();
        //
        System.out.println(method.getName());
    }*/
}
