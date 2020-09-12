package dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pojo.Cat;
import pojo.Dog;

@Configuration
@ComponentScan("pojo")
public class hh {
    @Bean
    public Cat getcc(){
        return new Cat();
    }

    @Bean
    public Dog getdd(){
        return new Dog();
    }
}
