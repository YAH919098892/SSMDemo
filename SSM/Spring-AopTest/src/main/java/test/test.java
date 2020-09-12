package test;

import anhua.Isay;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test {

    @Test
    public void testt(){
       // ApplicationContext app=new FileSystemXmlApplicationContext("E:\\Date\\SSMDemo\\Spring-AopTest\\src\\main\\res\\applicationContext.xml");
ApplicationContext app2=new FileSystemXmlApplicationContext("applicationContext.xml");
        Isay isay = (Isay) app2.getBean("isay");
        isay.say();
    }
}
