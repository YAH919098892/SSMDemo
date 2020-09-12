package daoMapper;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import pojo.User;

import java.util.List;

public class UserMapperImp2 extends SqlSessionDaoSupport implements UserMapper{

    @Override
    public List<User> selectUser() {
       SqlSession sqlSession= getSqlSession();
       return sqlSession.getMapper(UserMapper.class).selectUser();
    }

    @Override
    public List<User> selectUserone(int id) {
        return null;
    }
}
