package dao;

import org.apache.ibatis.annotations.Param;
import pojo.TbClass;

import java.util.List;

public interface TbClassMapper {
//    List<TbClass> getTbClass();
    List<TbClass> getTbClass2(@Param("no") String id);
}
