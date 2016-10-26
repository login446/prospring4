package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by admin on 30.09.2016.
 */
public class SimpleBeanRun {
    public static void main(String[] args) {
        GenericXmlApplicationContext cxt = new GenericXmlApplicationContext();
        cxt.load("classpath:spring/app-context-xml.xml");
        cxt.refresh();
        //SimpleBean parent = (SimpleBean) cxt.getBean("parentSimpleBean");
        SimpleBean child = (SimpleBean) cxt.getBean("childSimpleBean");
        //System.out.println(parent);
        System.out.println(child);
    }
}
