package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtil {
    private  static SqlSessionFactory sqlSessionFactory=null;
    static {
        try {
            String resource = "Mybatis-confige.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //2.根据配置文件构建sqlSessionFactory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //3.构建一个会话 创建SqlSession

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public  static  SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}

