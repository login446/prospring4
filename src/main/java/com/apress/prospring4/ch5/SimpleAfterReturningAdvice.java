package com.apress.prospring4.ch5;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/**
 * Created by alex on 17.10.2016.
 */
public class SimpleAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println();
        System.out.println("After method: " + method.getName());
    }

    public static void main(String[] args) {
        MessageWriter target = new MessageWriter();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new SimpleAfterReturningAdvice());
        pf.setTarget(target);
        MessageWriter proxy = (MessageWriter) pf.getProxy();
        proxy.writeMessage();
    }
}
