package test3;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforLoge implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before----"+o.getClass().getName()+"类的"+method.getName()+"方法被执行了");
    }
}
