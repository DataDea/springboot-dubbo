package com.dubbo.beans;

import java.io.Serializable;

/**
 * @author yanghai
 * @date 18-8-2 下午7:42
 */
public class User implements Serializable {

    private String name;
    private String age;
    private String address;

    public User(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
