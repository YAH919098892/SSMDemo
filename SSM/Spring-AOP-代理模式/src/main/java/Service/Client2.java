package Service;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client2 {
    @Test
    public void test00(){
        UserServiceImp userServiceImp=new UserServiceImp();
        UserServiceProxy userServiceProxy=new UserServiceProxy();
        userServiceProxy.setUserServiceImp(userServiceImp);
        userServiceProxy.add();
    }
    @Test
    public void test002(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service= applicationContext.getBean("userService",UserService.class);
        service.add();
        service.deleter();
    }
}
