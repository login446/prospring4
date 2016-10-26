package com.apress.prospring4.ch5;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by alex on 17.10.2016.
 */
public class MessageDecorator implements MethodInterceptor{
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.print("Hello ");
        Object retVal = methodInvocation.proceed();
        System.out.println("!");
        return retVal;
    }
}
