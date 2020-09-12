package test;


import dao.StudentMapper;
import dao.TbClassMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import pojo.Student;
import pojo.TbClass;
import util.MybatisUtil;

import java.util.List;

public class MyTest {
@Test
    public void mytest22(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        TbClassMapper tbClassMapper= sqlSession.getMapper(TbClassMapper.class);
    TbClass tbClass = (TbClass) tbClassMapper.getTbClass2("123");
    System.out.println(tbClass.toString());
        sqlSession.close();
    }
    @Test
    public void mytest232(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList=studentMapper.getStudent("RJ171");
        for (Student student:studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void mytest23902(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        TbClassMapper tbClassMapper=sqlSession.getMapper(TbClassMapper.class);
        List<TbClass> classList= tbClassMapper.getTbClass2("RJ171");
        for (TbClass tbClass:classList){
            System.out.println(tbClass);
        }
        sqlSession.close();
    }
}
