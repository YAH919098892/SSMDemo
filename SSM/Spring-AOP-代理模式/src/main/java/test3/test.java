package test3;

import Service.UserService;
import Service.UserServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applica3.xml");
      Say say=applicationContext.getBean("say",Say.class);
      say.catSay();
    }
    @Test
    public void test11(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applica3.xml");
        Say say=applicationContext.getBean("say",Say.class);
        say.catSay();

    }
    @Test
    public void test131(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("app.xml");
        Say say=applicationContext.getBean("sayImp",Say.class);
        say.catSay();

    }
}
