package Service;

import lombok.Data;

@Data
public class UserServiceProxy implements UserService {
    private UserServiceImp userServiceImp;

    @Override
    public void add() {
        log("add");
        userServiceImp.add();
    }

    @Override
    public void deleter() {
        log("deleter");
userServiceImp.deleter();
    }

    @Override
    public void update() {
        log("update");
     userServiceImp.update();
    }
    public void log(String msg){
        System.out.println("使用了"+msg+"方法!!!!!");
    }
}
