package test3;

import org.springframework.stereotype.Component;

@Component
public class SayImp implements Say {
    @Override
    public void dogSay() {
        System.out.println("狗说=====");
    }

    @Override
    public void catSay() {
        System.out.println("猫说=====");

    }

    @Override
    public void pepoleSay() {
        System.out.println("人说=====");
    }
}
