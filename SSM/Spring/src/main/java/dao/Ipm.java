package dao;

import ipm.User;

public class Ipm implements User {

    @Override
    public void getUser() {
        System.out.println("我是用户1111");
    }
}
