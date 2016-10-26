package com.apress.prospring4.ch5;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/**
 * Created by alex on 17.10.2016.
 */
public class SimpleBeforeAdvice implements MethodBeforeAdvice {
    public static void main(String[] args) {
        MessageWriter target = new MessageWriter();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new SimpleBeforeAdvice());
        proxyFactory.setTarget(target);

        MessageWriter proxy = (MessageWriter) proxyFactory.getProxy();
        proxy.writeMessage();
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before method: " + method.getName());
    }
}
