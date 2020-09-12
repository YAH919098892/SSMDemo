package test3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DiyPoincut {
    @Before("execution(* test3.SayImp.*(..))")
    public void before1(){
        System.out.println("befoer方法==========");
    }
    @After("execution(* test3.SayImp.*(..))")
    public void after1(){
        System.out.println("after==========");
    }
}
