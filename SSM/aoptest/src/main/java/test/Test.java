package test;

import daoMapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class Test {
    @org.junit.jupiter.api.Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mybatis-spring.xml");
        UserMapper userMapper=applicationContext.getBean("userMapperImp", UserMapper.class);
        for (User user:userMapper.selectUser()){
            System.out.println(user.toString());
        }
    }
    @org.junit.jupiter.api.Test
    public void test31(){
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationConfige.xml");
UserMapper userMapper=applicationContext.getBean("userMapperImp",UserMapper.class);
userMapper.addUser(new User(55544,"hhh","iuiu"));
    }
    @org.junit.jupiter.api.Test
    public void test12(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationConfige.xml");
        UserMapper userMapper=applicationContext.getBean("userMapperImp", UserMapper.class);
        userMapper.delete(55544);
    }
}
