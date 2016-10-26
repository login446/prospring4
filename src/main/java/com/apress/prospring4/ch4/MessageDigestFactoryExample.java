package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by admin on 04.10.2016.
 */
public class MessageDigestFactoryExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        MessageDigester digester = (MessageDigester) ctx.getBean("digester1");
        digester.digest("Hello World!");
    }
}
