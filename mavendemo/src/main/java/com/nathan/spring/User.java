package com.nathan.spring;

/**
 * @author Martin
 * @create $2021-05-28-15:51
 **/
public class User {

    //定义私有变量
    private String username;
    private int age;

    private  Car car;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
