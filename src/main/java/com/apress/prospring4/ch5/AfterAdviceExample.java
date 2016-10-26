package com.apress.prospring4.ch5;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by alex on 17.10.2016.
 */
public class AfterAdviceExample {
    private static KeyGenerator getKeyGenerator(){
        KeyGenerator target = new KeyGenerator();

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new WeakKeyCheckAdvice());
        pf.setTarget(target);

        return (KeyGenerator) pf.getProxy();
    }

    public static void main(String[] args) {
        KeyGenerator keyGenerator = getKeyGenerator();
        for(int i = 0; i < 10; i++){
            try {
                System.out.println("Key: " + keyGenerator.getKey());
            }catch (SecurityException ex){
                System.out.println("Weak Key Generated!");
            }
        }
    }
}
