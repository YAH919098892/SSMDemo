package pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
@Data
public class Dog {
    @Autowired
    Cat cat;
    public void say(){
        System.out.println("汪汪汪========");
    }
}
