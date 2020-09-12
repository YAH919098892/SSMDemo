package dao;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDaoMapper {
    List<User> getUserList();
    User getUser(int no);
     int addUser(User user);
     int updateUser(User user);
     int delectUser(@Param("id") int id);
     User getUserById(Map<String ,Object> map);
     int updateUserMap(Map<String,Object> map);
     List<User> getUserLike(String value);
}
