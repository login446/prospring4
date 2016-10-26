package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by admin on 04.10.2016.
 */
public class MessageDigestExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        MessageDigester messageDigester = (MessageDigester) ctx.getBean("digester");
        messageDigester.digest("Hello World!");
    }
}
