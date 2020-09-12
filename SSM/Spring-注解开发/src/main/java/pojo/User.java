package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Controller
//将这个类托管到spring中，注入到ioc容器
@Scope(value = "singleton")
public class User {
    @Value("冯进玉======")
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
