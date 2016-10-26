package com.apress.prospring4.ch3.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 22.09.2016.
 */
@Service("injectSimpleSpel")
public class InjectSimpleSpel {
    @Value("#{injectSimpleConfig.name}")
    private String name;
    @Value("#{injectSimpleConfig.age - 11}")
    private int age;
    @Value("#{injectSimpleConfig.height}")
    private float height;
    @Value("#{injectSimpleConfig.programmer}")
    private boolean programmer;
    @Value("#{injectSimpleConfig.ageInSeconds}")
    private Long ageInSeconds;

    public static void main(String[] args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        InjectSimpleSpel simple = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }
}
