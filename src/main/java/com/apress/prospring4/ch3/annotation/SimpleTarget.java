package com.apress.prospring4.ch3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 23.09.2016.
 */
@Component("simpleTarget")
@Scope("prototype")
public class SimpleTarget {
    //@Autowired
    //@Qualifier("message")
    private String message;

    public String getVal() {
        return message;
    }

    //@Resource(name = "message")
    public void setVal(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return getVal();
    }

    @Bean(name = "simpleTarget1")
    @Autowired
    public SimpleTarget getSimpleTarget1(@Qualifier("message1") String message) {
        SimpleTarget emf = new SimpleTarget();
        emf.setVal(message);
        return emf;
    }

    @Bean(name = "simpleTarget2")
    @Autowired
    public SimpleTarget getSimpleTarget2(@Qualifier("message2") String message) {
        SimpleTarget emf = new SimpleTarget();
        emf.setVal(message);
        return emf;
    }

}
