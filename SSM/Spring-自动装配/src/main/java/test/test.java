package test;

import dao.hh;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Cat;
import pojo.Dog;
import pojo.People;
import pojo.Student;

public class test {
    @Test
    public void tsetA(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appliation.xml");
        People people=applicationContext.getBean("peopel",People.class);
        people.getDog().say();
        System.out.println(people.getName());
    }
    @Test
    public void tsetA2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appliation.xml");
        Student student =applicationContext.getBean("student",Student.class);
        student.getCat().say();
        student.getCat().getDog().say();
        System.out.println(student.getName());
    }
    @Test
    public void tsetA222(){
     ApplicationContext applicationContext=new AnnotationConfigApplicationContext(hh.class);
        Cat cat=applicationContext.getBean("cat",Cat.class);
       Dog dog =applicationContext.getBean("getdd",Dog.class);
        cat.say();
        dog.getCat().say();
    }

    @Test
    public void tsetA22wer2(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(hh.class);
        Cat cat=applicationContext.getBean("dog",Cat.class);
        Dog dog =applicationContext.getBean("getdd",Dog.class);
        cat.say();
        dog.getCat().say();
    }

    @Test
    public void tsetA22w(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appliation.xml");
        Dog dog= (Dog) applicationContext.getBean("dog1");
        dog.getCat().say();

    }
}
