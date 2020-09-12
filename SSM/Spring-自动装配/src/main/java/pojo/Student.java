package pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Student {
    @Autowired
    private Cat cat;
    @Value("我是学生")
    private String name;

}
