package com.wangxutao.extendsobject;/**
 * @Classname Person
 * @Description TODO
 * @Date 2021/1/30 19:57
 * @Created by wangxutao
 */

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.*;

public class Person {
    String name;
    int age;

    void eat() {
        System.out.println(name + "eat !");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person() {
    }

    public void sleep() {
        System.out.println(name + " sleep !");
    }
}
class students extends Person{
    //    String name;
//    int age;
    String school;

    void stduy() {
        System.out.println("learning ");
    }
    public students(String name, int age,String school) {
        this.name = name;
        this.age = age;
        this.school = school;

    }
    students() {

    }

//    @Override
//    public void sleep() {
//        System.out.println(name + " sleep !");
//    }
    //    void eat() {
//        System.out.println(name + "eat !");
//    }
//
}
