package dao;

import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int addUser(Map map);
//    if
    List<User> showUser(Map map);

    List<User> showUserChoose(Map map);

    int updateUser(Map map);
}
