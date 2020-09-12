package test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import testt.Aaa;

public class Ttt {
    @Test
    public void tee(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Ttt.xml");
        Aaa aaa= (Aaa) applicationContext.getBean("aaaImp");
        System.out.println("==========");
        aaa.say();
        aaa.doo();
    }
}
