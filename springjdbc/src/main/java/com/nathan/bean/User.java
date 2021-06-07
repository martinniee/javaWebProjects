package com.nathan.bean;

/**
 * @author Martin
 * @create $2021-05-28-21:15
 **/
public class User {

     //私有变量
    private  String username;
    private  String password;
    private int Id;
    private Car car;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Id=" + Id +
                ", car=" + car +
                '}';
    }
}
