package com.apress.prospring4.ch5;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by alex on 17.10.2016.
 */
public class WeakKeyCheckAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        if ((o1 instanceof KeyGenerator) && ("getKey".equals(method.getName()))){
            long key = (Long) o;

            if(key == KeyGenerator.WEAK_KEY){
                throw new SecurityException("Key Generator generated a weak key. Try again");
            }
        }
    }
}
