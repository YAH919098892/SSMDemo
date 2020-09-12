package Service;

import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImp implements UserService {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void deleter() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("更改了一个用户");
    }
}
