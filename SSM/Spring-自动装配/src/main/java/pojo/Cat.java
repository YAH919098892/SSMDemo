package pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Data
@Controller
public class Cat {
    @Autowired
    private Dog dog;
    public void say(){
        System.out.println("喵喵喵========");
    }
}
