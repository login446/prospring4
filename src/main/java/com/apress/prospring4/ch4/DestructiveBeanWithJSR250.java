package com.apress.prospring4.ch4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;

/**
 * Created by alex on 02.10.2016.
 */
public class DestructiveBeanWithJSR250 implements ApplicationContextAware {
    private File file;
    private String filePath;

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean");

        if (filePath == null) {
            throw new IllegalArgumentException("You bust specify the filePath property of " + DestructiveBeanWithJSR250.class);
        }
        this.file = new File(filePath);
        this.file.createNewFile();
        System.out.println("File exists: " + file.exists());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying Bean");
        if (!file.delete()) {
            System.err.println("ERROR: failed to delete file.");
        }
        System.out.println("File exists: " + file.exists());
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        DestructiveBeanWithJSR250 bean = (DestructiveBeanWithJSR250) ctx.getBean("destructiveBean");
        //ctx.getBean("shutdownHook");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (applicationContext instanceof GenericApplicationContext)
            ((GenericApplicationContext) applicationContext).registerShutdownHook();
    }
}
