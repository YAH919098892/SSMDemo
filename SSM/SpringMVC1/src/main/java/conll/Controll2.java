package conll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequestMapping("/hh")
public class Controll2 {
    @RequestMapping("/hh")
    public String an(Model model){
model.addAttribute("msg2","你好我是杨安华！");
//model.setViewName("hh");
return "form";
    }
    @RequestMapping("/hh2")
    public String an2(Model model, HttpServletResponse response, HttpServletRequest request) throws IOException {

        model.addAttribute("msg","你好我sgsd！");
        //model.setViewName("hh");
        request.getSession().setAttribute("mss","hhh");
        return "index";
    }
}
