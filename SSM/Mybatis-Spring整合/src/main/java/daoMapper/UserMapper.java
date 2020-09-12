package daoMapper;

import org.apache.ibatis.annotations.Select;
import pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
    @Select("select * from dbstudent.tbuser where no=#{no}")
    List<User> selectUserone(int id);
}
