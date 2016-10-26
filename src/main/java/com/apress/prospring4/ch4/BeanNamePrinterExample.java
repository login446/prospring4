package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by admin on 04.10.2016.
 */
public class BeanNamePrinterExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        BeanNamePrinter bean = (BeanNamePrinter) ctx.getBean("beanNamePrinter");
        bean.someOperation();
    }
}
