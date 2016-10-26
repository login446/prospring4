package com.apress.prospring4.ch4;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by admin on 04.10.2016.
 */
public class BeanNamePrinter implements BeanNameAware {
    private String beanName;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    public void someOperation() {
        System.out.println("Bean [" + beanName + "] - someOperation()");
    }
}
