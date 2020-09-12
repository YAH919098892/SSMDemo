package user;

import org.junit.jupiter.api.Test;

public class Client {
    @Test
public void test(){
        HousMan housMan=new HousMan();
        Proxy proxy=new Proxy(housMan);
        proxy.rent();
    }

}
