package test;

import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import pojo.User;
import util.DataUtil;
import util.DayUtil;
import util.MybatisUtil;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTast {
    @Test
    public void testA() throws ParseException {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
//        User user=new User();
//        user.setId(DataUtil.getId());
//        user.setAiHao("聊天==");
//        user.setName("冯进玉");
//        user.setBirstaday(DayUtil.getDay("1111-11-11 20:20:20"));
       Map<String,Object> map=new HashMap<>();
       map.put("id",DataUtil.getId());
       map.put("aiHao","不知道");
       map.put("birstaday",DayUtil.getDay("1111-11-11 20:20:20"));
       map.put("name","黄小菊");
        mapper.addUser(map);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testB() throws ParseException {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<>();
        map.put("aiHao","不知道");
        map.put("name","%小%");

        List<User> userList= mapper.showUser(map);
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void testC() throws ParseException {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<>();
        //map.put("aiHao","不知道");
        map.put("aiHao","聊天==");
        map.put("id","1c6cccaddf8f45938698a2dd832ab963");
        List<User> userList= mapper.showUserChoose(map);
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void testD() throws ParseException {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<>();
        map.put("aiHao","喜欢杨安华");
        map.put("name","Jason");
        map.put("birstaday",DayUtil.getDay("1111-11-11 20:20:20"));
        map.put("id","123");
        map.put("home","茂名");
        mapper.updateUser(map);
        sqlSession.commit();
        sqlSession.close();
    }
}
