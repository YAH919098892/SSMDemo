package Service;

import org.aopalliance.aop.Advice;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logo implements Advice {
    public void log()
    {
        System.out.print("正在进行日志的记录");
    }
    @Pointcut("execution(* Service.UserServiceImp.*())")
    public  void myPoincut(){
    }

    @After("myPoincut()")
    public void before (JoinPoint jp)
    {
        //System.out.println("前置通知，模拟权限控制");
        System.out.println("正在还执行"+jp.getSignature().getName()+"方法");
    }
}
