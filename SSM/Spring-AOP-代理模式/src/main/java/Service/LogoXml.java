package Service;

import org.springframework.aop.MethodBeforeAdvice;
import sun.reflect.MethodAccessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LogoXml implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] arg, Object targer) throws Throwable {
        System.out.println(targer.getClass().getName()+"的"+method.getName()+"被执行");
    }


}
