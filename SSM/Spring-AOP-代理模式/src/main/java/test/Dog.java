package test;

import org.aopalliance.aop.Advice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class Dog implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o1.getClass().getName()+"de"+method.getName()+"被执行");
    }
}


