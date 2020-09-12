package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Student;
import pojo.TbClass;

import java.util.List;

public interface StudentMapper {
    public List<Student> getStudent(String no);
}
