package pojo;

import jdk.nashorn.internal.objects.annotations.Setter;


public class User {
    private int no;
    private String name;
    private String password;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int no, String name, String password) {
        this.no = no;
        this.name = name;
        this.password = password;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
