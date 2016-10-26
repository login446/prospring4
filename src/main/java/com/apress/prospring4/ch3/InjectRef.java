package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by admin on 22.09.2016.
 */
public class InjectRef {
    private Oracle oracle2;
    public void setOracle(Oracle oracle){
        this.oracle2 = oracle;
    }

    @Override
    public String toString() {
        return oracle2.defineMeaningOfLife();
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        InjectRef injectRef = (InjectRef) ctx.getBean("injectRef");
        System.out.println(injectRef);
    }
}
