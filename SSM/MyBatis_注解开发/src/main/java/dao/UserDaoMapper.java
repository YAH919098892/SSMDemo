package dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDaoMapper {
@Select("select * from tbuser")
List<User> getUser();
@Select("select password as pas,no,name from tbuser where no= #{nn}")
User getUserById(int noo);
@Insert("insert into tbuser(no,name,password) values(#{no},#{name},#{password})")
int addUser(User user);
}
