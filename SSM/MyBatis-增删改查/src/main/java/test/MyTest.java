package test;

import dao.UserDaoMapper;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;
import pojo.User;
import util.MybatisUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserDaoMapper userDao=sqlSession.getMapper(UserDaoMapper.class);
        List<User> userList = userDao.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserDaoMapper userDao=sqlSession.getMapper(UserDaoMapper.class);
        User user=userDao.getUser(127);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void test21(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserDaoMapper userDao=sqlSession.getMapper(UserDaoMapper.class);
        List<User> userList= userDao.getUserLike("%安%");
       for(User user:userList){
           System.out.println(user);
       }
        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserDaoMapper userDao=sqlSession.getMapper(UserDaoMapper.class);
        int sount = userDao.addUser(new User(55,"anhua","123444"));
      // sqlSession.commit();
       if (sount>=1){
           System.out.println("成功了"+sount);
       }
        sqlSession.close();
    }
    @Test
    public void test4(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserDaoMapper userDao=sqlSession.getMapper(UserDaoMapper.class);
        int co=userDao.updateUser(new User(55,"anhu99a11","hhhhh"));
        System.out.println(co);
        sqlSession.close();
    }
    @Test
    public void test7(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserDaoMapper userDao=sqlSession.getMapper(UserDaoMapper.class);
        Map<String,Object> map=new HashMap<>();
        map.put("no",55);
        map.put("name","杨安华哈哈哈");
        map.put("pass","9876");
        userDao.updateUserMap(map);
        sqlSession.close();
    }
    @Test
    public void test5(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserDaoMapper userDao=sqlSession.getMapper(UserDaoMapper.class);
        userDao.delectUser(455);
        sqlSession.close();
    }
    @Test
    public void test6(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserDaoMapper userDao=sqlSession.getMapper(UserDaoMapper.class);
        Map<String ,Object> map=new HashMap<String,Object>();
        map.put("myno",77);
        map.put("name","777");
        map.put("pass","777");
        userDao.getUserById(map);
        sqlSession.close();
    }

}
