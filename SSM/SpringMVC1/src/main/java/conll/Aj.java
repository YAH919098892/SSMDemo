package conll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class Aj {
    @RequestMapping("/a1")
    public void jax1(String name, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        System.out.println("a1:param=>"+name);
        if ("anhua".equals(name)){
            response.getWriter().println("我是杨安华");
        }
        else  if ("an".equals(name)){
            response.getWriter().println("我是安");
        }
        else {
            response.getWriter().println("我不是人");
        }
    }
}
