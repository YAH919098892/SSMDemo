package dao;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDaoMapper {
   User getUser(@Param("id") int no);
    User getUserByNo(int no);

    List<User> getUserlimit(Map<String,Object> map);
    //List<User> getUserRowBounds();

}
