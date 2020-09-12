package com.controller;

import com.pojo.Tbstudent;
import com.service.TbstudentService;
import com.service.TbstudentServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class StudentController {
    //控制层调用service层
    @Autowired
    @Qualifier("tbstudentServiceImp")
    public TbstudentService tbstudentService;
    @RequestMapping("/all")
    public String list(Model model, HttpServletResponse response, HttpServletRequest request){
        response.setCharacterEncoding("utf-8");
        List<Tbstudent> tbstudents=tbstudentService.selectStudent();

        model.addAttribute("list",tbstudents.size()+"个人");
        System.out.println(tbstudents.size());
        return "allStudent";
    }



}
