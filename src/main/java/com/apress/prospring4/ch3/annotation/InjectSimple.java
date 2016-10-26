package com.apress.prospring4.ch3.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 22.09.2016.
 */
@Service("injectSimple")
public class InjectSimple {
    @Value("Chris Schaefer annotation")
    private String name;
    @Value("33")
    private int age;
    @Value("2.2")
    private float height;
    @Value("false")
    private boolean programmer;
    @Value("1009843201")
    private Long ageInSeconds;

    public static void main(String[] args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
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
