package user;

public class Proxy implements RentHous {
    private HousMan housMan;

    public Proxy() {
    }

    public Proxy(HousMan housMan) {
        this.housMan = housMan;
    }

    public HousMan getHousMan() {
        return housMan;
    }

    public void setHousMan(HousMan housMan) {
        this.housMan = housMan;
    }

    @Override
    public void rentHous() {
        System.out.println("我是中介，代理房子出租房子");
    }
    public void seeHous(){
        System.out.println("带你你去看房子");
    }
    public void buy(){
        System.out.println("同意签合同");
    }
    public void rent(){
        housMan.rentHous();
        rentHous();
        seeHous();
        buy();
    }
}
