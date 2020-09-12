package daoMapper;

import pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
    int addUser(User map);
    int delete(int no);
}
