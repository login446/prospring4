package com.apress.prospring4.ch4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created by admin on 04.10.2016.
 */
public class ShutdownHookBean implements ApplicationContextAware {
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (applicationContext instanceof GenericApplicationContext) {
            ((GenericApplicationContext) applicationContext).registerShutdownHook();
        }
    }
}
