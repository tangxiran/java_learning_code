package com.firstproject.bean;/**
 * @Classname Customer
 * @Description TODO
 * @Date 2021/1/30 16:20
 * @Created by wangxutao
 */

import java.util.*;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private char gender;
    private int age;

    public Customer(String name, String email, String phone, char gender, int age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.age = age;
    }

    Customer() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
