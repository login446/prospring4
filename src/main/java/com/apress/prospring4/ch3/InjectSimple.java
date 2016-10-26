package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by admin on 22.09.2016.
 */
public class InjectSimple {
    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;

    public static void main(String[] args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        InjectSimple simple = (InjectSimple) ctx.getBean("injectSimple");
        System.out.println(simple);
    }
    public void setAgeInSeconds(Long ageInSeconds){
        this.ageInSeconds = ageInSeconds;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Age in Seconds: " + ageInSeconds +"\n"
                + "Height: " + height + "\n"
                + "Is Programmer?: " + programmer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
