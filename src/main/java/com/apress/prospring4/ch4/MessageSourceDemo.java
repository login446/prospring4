package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Locale;

/**
 * Created by admin on 05.10.2016.
 */
public class MessageSourceDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        Locale english = Locale.ENGLISH;
        Locale czech = new Locale("cs", "CZ");
        System.out.println(ctx.getMessage("msg", null, english));
        System.out.println(ctx.getMessage("msg", null, czech));
        System.out.println(ctx.getMessage("nameMsg", new Object[]{"Chris", "Schaefer"}, english));
    }
}
