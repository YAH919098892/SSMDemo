package dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pojo.Student;
import pojo.User;

@Configuration
@ComponentScan("pojo")
public class Anhua {
    @Bean
    public Student getStuden(){
        return new Student();
    }
   @Bean
    public User getUser(){
        return new User();
    }
}
