package dao;

import ipm.User;

public class Imp2 implements User {
    @Override
    public void getUser() {
        System.out.println("我是用户2222");
    }
}
