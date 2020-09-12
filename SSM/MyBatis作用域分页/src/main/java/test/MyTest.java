import dao.UserDaoMapper;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import pojo.User;
import util.MybatisUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    static Logger logger=Logger.getLogger(MyTest.class);


    @Test
    public void test2(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserDaoMapper userDao=sqlSession.getMapper(UserDaoMapper.class);
        User user=userDao.getUser(127);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserDaoMapper userDao=sqlSession.getMapper(UserDaoMapper.class);
        User user=userDao.getUserByNo(55);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void test5(){
     SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserDaoMapper mapper = sqlSession.getMapper(UserDaoMapper.class);
        Map map=new HashMap<String,Object>();
        map.put("startIndex",0);
        map.put("pageSize",4);
List<User> list=mapper.getUserlimit(map);
for (User user:list){
    System.out.println(user);
}
sqlSession.close();
    }
    @Test
    public void testRowBounds(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserDaoMapper mapper = sqlSession.getMapper(UserDaoMapper.class);
//        通过RowBounds实现
        RowBounds rowBounds = new RowBounds(0, 4);
        //通过java实现
        List<User> userlist = sqlSession.selectList("dao.UserDaoMapper.getUserRowBounds",null,rowBounds);
        for (User user:userlist){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
