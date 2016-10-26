package com.apress.prospring4.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 06.10.2016.
 */
public class JavaConfigXMLExample {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/app-context-xml.xml");
        MessageRenderer renderer = ctx.getBean("messageRenderer4", MessageRenderer.class);
        renderer.render();
    }
}
