package com.bean;

/**
 * Created by IntelliJ IDEA.
 * Author : chenhaibo
 * Version : v1.0.0
 * Time : 2016/9/24.
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }
}
