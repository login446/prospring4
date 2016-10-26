package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by admin on 22.09.2016.
 */
public class ConstructorConfusion {
    private String someValue;
    public ConstructorConfusion(String someValue){
        this.someValue = someValue;
    }
    public ConstructorConfusion(int someValue){
        this.someValue = "Number: " + Integer.toString(someValue);
    }
    public static void main(String[] args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        ConstructorConfusion cc = (ConstructorConfusion) ctx.getBean("constructorConfusion");
        System.out.println(cc);
    }
    @Override
    public String toString(){
        return someValue;
    }
}
