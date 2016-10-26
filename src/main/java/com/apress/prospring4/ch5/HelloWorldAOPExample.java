package com.apress.prospring4.ch5;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by alex on 17.10.2016.
 */
public class HelloWorldAOPExample {
    public static void main(String[] args){
        MessageWriter target = new MessageWriter();

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new MessageDecorator());
        pf.setTarget(target);

        MessageWriter proxy = (MessageWriter) pf.getProxy();

        target.writeMessage();
        System.out.println();
        proxy.writeMessage();
    }
}
