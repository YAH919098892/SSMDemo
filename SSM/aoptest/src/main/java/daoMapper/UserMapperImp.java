package daoMapper;

import org.mybatis.spring.SqlSessionTemplate;
import pojo.User;

import java.util.List;

public class UserMapperImp implements UserMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper=sqlSessionTemplate.getMapper(UserMapper.class);
       return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
    UserMapper mapper=sqlSessionTemplate.getMapper(UserMapper.class);
    return mapper.addUser(user);
    }

    @Override
    public int delete(int no) {
        UserMapper mapper=sqlSessionTemplate.getMapper(UserMapper.class);
       mapper.addUser(new User(88884,"hh","hhh"));
        return mapper.delete(no);
    }
}
