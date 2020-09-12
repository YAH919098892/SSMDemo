package AopTest;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void testt(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("TestAop.xml");
       AopPoin aopPoin= (AopPoin) applicationContext.getBean("point");
       aopPoin.pointest();
    }
}
