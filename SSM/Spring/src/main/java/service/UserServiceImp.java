package service;

import dao.Imp2;
import dao.Ipm;
import ipm.User;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserServiceImp implements UserService{
 private User user;
@Autowired
 private Imp2 imp2;
@Autowired
 private Ipm imp;

    public UserServiceImp() {
    }

    public UserServiceImp(User user, Imp2 imp2, Ipm imp) {
        this.user = user;
        this.imp2 = imp2;
        this.imp = imp;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Imp2 getImp2() {
        return imp2;
    }

    public void setImp2(Imp2 imp2) {
        this.imp2 = imp2;
    }

    public Ipm getImp() {
        return imp;
    }

    public void setImp(Ipm imp) {
        this.imp = imp;
    }




    @Override
    public void getUser() {
        this.user.getUser();
    }
}
