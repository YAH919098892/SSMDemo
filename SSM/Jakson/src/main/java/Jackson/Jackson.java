package Jackson;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class Jackson {
    @RequestMapping("/j1")
    @ResponseBody
public String json1() throws JsonProcessingException {
        User user=new User(1,"安华","中国");
        ObjectMapper mapper=new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(simpleDateFormat);
        Date data=new Date();
        String da=mapper.writeValueAsString(data);
    return da;
}
    @RequestMapping("/j2")
    public String json2(Model model) throws JsonProcessingException {
        User user=new User(1,"安华","中国");
        String user2 = "{\"id\": 1,\"name\": \"小明\",\"home\": \"中国\"}";
        ObjectMapper mapper = new ObjectMapper();
        ObjectMapper mapper1 = new ObjectMapper();
        //Json映射为对象
        User user1 = mapper1.readValue(user2, User.class);
        System.out.println(user1);
        String s = mapper.writeValueAsString(user1);
        model.addAttribute("msg",s);
        System.out.println(user2);
        System.out.println(s);
        return "json";
    }
    @RequestMapping("/j3")
    @ResponseBody
    public String json3(Model model) throws JsonProcessingException {
        final List<User> userList=new ArrayList<>();
        userList.add(new User(1, "安华", "中国"));
        userList.add(new User(2, "安华", "中国"));
        userList.add(new User(3, "安华", "中国"));
        userList.add(new User(4, "安华", "中国"));
        String s = JSON.toJSONString(userList);
        System.out.println("json格式"+s);
        System.out.println(userList);
        Object o = JSON.toJSON(userList);
        System.out.println("json格式"+o);
        String user2 = "{\"id\": 1,\"name\": \"小明\",\"home\": \"中国\"}";
        User user = JSON.parseObject(user2, User.class);
        System.out.println(s==o);
        System.out.println("对象："+user);
        System.out.println(userList==user);
        return "so";
    }
}
