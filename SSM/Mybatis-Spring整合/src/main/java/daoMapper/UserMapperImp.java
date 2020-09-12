package daoMapper;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
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
    public List<User> selectUserone(int id) {
        UserMapper userMapper=sqlSessionTemplate.getMapper(UserMapper.class);
        return userMapper.selectUserone(id);
    }
}
