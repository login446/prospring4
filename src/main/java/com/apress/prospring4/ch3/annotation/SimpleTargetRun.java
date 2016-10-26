package com.apress.prospring4.ch3.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 23.09.2016.
 */

public class SimpleTargetRun {

    public static void main(String[] args) {
        GenericXmlApplicationContext gxc = new GenericXmlApplicationContext();
        gxc.load("classpath:spring/app-context-annotation.xml");
        gxc.refresh();
        SimpleTarget simpleTarget = (SimpleTarget) gxc.getBean("simpleTarget");
        SimpleTarget simpleTarget1 = (SimpleTarget) gxc.getBean("simpleTarget1");
        SimpleTarget simpleTarget2 = (SimpleTarget) gxc.getBean("simpleTarget2");
        System.out.println(simpleTarget + "\n" + simpleTarget1 + "\n" + simpleTarget2);
    }
}
