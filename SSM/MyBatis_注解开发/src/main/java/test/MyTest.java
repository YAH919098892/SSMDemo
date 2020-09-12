package test;

import dao.AddUserMapper;
import dao.UserDaoMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import pojo.User;
import util.MybatisUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
@Test
public void tests(){
    SqlSession sqlSession = MybatisUtil.getSqlSession();
    UserDaoMapper mapper=sqlSession.getMapper(UserDaoMapper.class);
    List<User> userList=mapper.getUser();
    for (User user:userList){
        System.out.println(user);
    }
    sqlSession.close();
}
@Test
    public void test22(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDaoMapper mapper=sqlSession.getMapper(UserDaoMapper.class);
       User user= mapper.getUserById(55);
        System.out.println(user.toString());
        sqlSession.close();
    }
    @Test
    public void test222(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDaoMapper mapper=sqlSession.getMapper(UserDaoMapper.class);
        int i = mapper.addUser(new User(909, "anhua", "bzd"));
        System.out.println(i);
        sqlSession.close();
    }
    @Test
    public void testY(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        AddUserMapper mapper=sqlSession.getMapper(AddUserMapper.class);
        Map map=new HashMap();
        map.put("no","44400");
        map.put("name","444");
        map.put("password","444");

        int i = mapper.addUser(map);
        //sqlSession.commit();
        sqlSession.close();
    }
}
