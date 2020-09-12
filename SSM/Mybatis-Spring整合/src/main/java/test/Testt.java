package test;

import daoMapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;
import util.MybatisUtil;

import java.util.List;
import java.util.Map;

public class Testt {

    @Test
    public void test2(){
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList=userMapper.selectUser();
        for (User user:userList){
            System.out.println(user.toString());
        }
    }
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mybatis-spring.xml");
        SqlSessionFactory sqlSessionFactory= (SqlSessionFactory) applicationContext.getBean("sqlSessiononFactory");
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList=userMapper.selectUser();
        for (User user:userList){
            System.out.println(user.toString());
        }
    }
    @Test
    public void test22(){
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationConfige.xml");
       UserMapper userMapper= (UserMapper) applicationContext.getBean("userMapper");
       List<User> list=userMapper.selectUser();
       for(User user:list){
           System.out.println(user.toString());
       }
    }
    @Test
    public void test222(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationConfige.xml");
        UserMapper userMapper= (UserMapper) applicationContext.getBean("userMapperImp2");
        for(User user:userMapper.selectUser()){
            System.out.println(user.toString());
        }
    }
    @Test
    public void test23422(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationConfige.xml");
        UserMapper userMapper= (UserMapper) applicationContext.getBean("userMapper");
            System.out.println(userMapper.selectUserone(1).toString());

    }
}
