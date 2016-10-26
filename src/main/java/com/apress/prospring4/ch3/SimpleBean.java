package com.apress.prospring4.ch3;

/**
 * Created by admin on 30.09.2016.
 */
public class SimpleBean {
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

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
