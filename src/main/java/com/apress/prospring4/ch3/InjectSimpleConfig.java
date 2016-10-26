package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by admin on 22.09.2016.
 */
public class InjectSimpleConfig {
    private String name = "Bobi";
    private int age = 34;
    private float height = 1.44f;
    private boolean programmer = true;
    private Long ageInSeconds = 1009843200L;

    public static void main(String[] args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        InjectSimpleConfig simple = (InjectSimpleConfig) ctx.getBean("injectSimple");
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
