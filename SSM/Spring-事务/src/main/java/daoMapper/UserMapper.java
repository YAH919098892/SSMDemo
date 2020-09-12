package daoMapper;

import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> selectUser();
    int addUser(User map);
    int delete(int id);
}
