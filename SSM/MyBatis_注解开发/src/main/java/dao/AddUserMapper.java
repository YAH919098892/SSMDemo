package dao;

import org.apache.ibatis.annotations.Insert;

import java.util.Map;

public interface AddUserMapper {
    @Insert("insert into tbuser (no,name,password) values(#{no},#{name},#{password})")
    int addUser(Map map);
}
