package test;

import com.controller.StudentController;
import com.dao.TbstudentMapper;
import com.pojo.Tbclass;
import com.pojo.Tbstudent;
import com.service.TbstudentService;
import com.service.TbstudentServiceImp;
import com.service.tbclass.ClassService;
import com.service.tbclass.ClassServiceImp;
import com.util.DateUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;
public class Test {
    @org.junit.jupiter.api.Test
    public void delectTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
      TbstudentService tbstudentService= (TbstudentService) applicationContext.getBean("tbstudentServiceImp");
      Tbstudent tbstudent=tbstudentService.selectStudentOne("12");
        System.out.println(tbstudent.toString());
    }

    @org.junit.jupiter.api.Test
    public void delectTest3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        TbstudentService tbstudentService= (TbstudentService) applicationContext.getBean("tbstudentServiceImp");
        List<Tbstudent> tbstudents=tbstudentService.selectStudent();
        for (Tbstudent tbstudent : tbstudents) {
            System.out.println(tbstudent.toString());
        }
    }
    @org.junit.jupiter.api.Test
    public void delectTest4(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassService classServiceImp= (ClassService) applicationContext.getBean("classServiceImp");
        List<Tbclass> tbclasses=classServiceImp.selectClass("DS171");
        for (Tbclass tbclass : tbclasses) {
            System.out.println(tbclass.toString());
        }
    }
    @org.junit.jupiter.api.Test
    public void delectTest43(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        TbstudentService tbstudentService= (TbstudentService) applicationContext.getBean("tbstudentServiceImp");

       Date aa=new DateUtil().getDate("1999-11-11","yyyy-MM-dd");
        tbstudentService.addStudent(new Tbstudent("1134563","12","女",aa,"12","RJ175","12"));

    }


}
