package com.apress.prospring4.ch3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 22.09.2016.
 */
@Service("constructorConfusion")
public class ConstructorConfusion {
    private String someValue;
    public ConstructorConfusion(String someValue){
        this.someValue = someValue;
    }
    @Autowired
    public ConstructorConfusion(@Value("90") int someValue){
        this.someValue = "Number: " + Integer.toString(someValue);
    }
    public static void main(String[] args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        ConstructorConfusion cc = (ConstructorConfusion) ctx.getBean("constructorConfusion");
        System.out.println(cc);
    }
    @Override
    public String toString(){
        return someValue;
    }
}
