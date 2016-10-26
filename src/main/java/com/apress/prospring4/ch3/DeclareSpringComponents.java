package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by alex on 21.09.2016.
 */
public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
        messageRenderer.render();
    }
}
