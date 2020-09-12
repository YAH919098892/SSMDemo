package test3;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLoge implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("after----"+method.getName()+"方法被执行了");
    }
}
