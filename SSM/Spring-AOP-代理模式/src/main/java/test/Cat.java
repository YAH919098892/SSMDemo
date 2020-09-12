package test;

import org.aopalliance.aop.Advice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Cat implements MethodBeforeAdvice {


    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(method.getName()+"hhhh");
    }
}
