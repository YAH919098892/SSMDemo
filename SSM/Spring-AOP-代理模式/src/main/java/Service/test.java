package Service;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) applicationContext.getBean("imp");
        userService.deleter();
    }
    @Test
    public void test12(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) applicationContext.getBean("imp");
        userService.deleter();
    }

}
