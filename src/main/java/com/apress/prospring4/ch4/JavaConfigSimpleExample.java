package com.apress.prospring4.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by admin on 06.10.2016.
 */
public class JavaConfigSimpleExample {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageRenderer renderer = ctx.getBean("messageRendererAnno", MessageRenderer.class);
        renderer.render();
    }
}
