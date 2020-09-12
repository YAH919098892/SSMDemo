package test;

import dao.Anhua;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;
import pojo.User;

public class test{
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appliation.xml");
        User user=applicationContext.getBean("user",User.class);
        System.out.println(user.name);
    }
    @Test
    public void test12(){
     ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Anhua.class);
     Student student= (Student) applicationContext.getBean("getStuden");
        System.out.println(student.getName());
    }
    @Test
    public void test122(){
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Anhua.class);
        Student student=applicationContext.getBean("getStu",Student.class);
        System.out.println(student.getName());

    }
    @Test
    public void test132(){
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Anhua.class);
      User user=applicationContext.getBean("user",User.class);
        System.out.println(user.getName());
    }
    @Test
    public void test13233(){
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Anhua.class);
        User user=applicationContext.getBean("getUser",User.class);
        System.out.println(user.getName());
    }
    @Test
    public void test132332(){
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Anhua.class);
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student.getName());
    }
}
