package test;

import ipm.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import pojo.Student;
import service.UserService;
import service.UserServiceImp;

public class test {
    @Test
    public void test1(){
        ApplicationContext applicationContext =new FileSystemXmlApplicationContext("E:\\Date\\SSMDemo\\Spring\\src\\main\\resources\\appliation.xml");
        UserServiceImp userService= (UserServiceImp) applicationContext.getBean("userservice");
        userService.getImp().getUser();
        userService.getImp2().getUser();
    }
    @Test
    public void test29(){
        ApplicationContext applicationContext =new FileSystemXmlApplicationContext("E:\\Date\\SSMDemo\\Spring\\src\\main\\resources\\appliation.xml");
        Student student= applicationContext.getBean("students",Student.class);
        System.out.println(student.toString());
    }
    @Test
    public void test22(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("appliation.xml");
        Student student= applicationContext.getBean("stuP",Student.class);
        Student student1= applicationContext.getBean("stuP",Student.class);
        Student student2= applicationContext.getBean("stuC",Student.class);
        System.out.println(student==student1);
        System.out.println(student.getName());
        System.out.println(student2.getName());
    }
}
