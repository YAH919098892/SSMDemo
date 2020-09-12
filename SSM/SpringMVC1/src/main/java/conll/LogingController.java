package conll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@Controller
public class LogingController {

    @RequestMapping("/login")
    public String log(Model model, String username, String password, HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        if (username.equals("安华")&password.equals("123")){
            model.addAttribute("t","没有乱码"+username);
        }
        else {
            model.addAttribute("f","乱码了"+username);
        }
        return "form";

    }
}
