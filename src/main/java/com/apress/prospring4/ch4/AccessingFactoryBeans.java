package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.security.MessageDigest;

/**
 * Created by admin on 04.10.2016.
 */
public class AccessingFactoryBeans {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        //MessageDigest digest = (MessageDigest) ctx.getBean("shaDigest");
        MessageDigestFactoryBean factoryBean = (MessageDigestFactoryBean) ctx.getBean("&shaDigest");
        try {
            MessageDigest shaDigest = factoryBean.getObject();
            System.out.println(shaDigest.digest("Hello world".getBytes()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
