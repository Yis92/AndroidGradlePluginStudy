package com.yis.bean;

/**
 * Created by liuyi on 2019-10-21.
 */
public class Student {

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }
}
