package com.apress.prospring4.ch5;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/**
 * Created by admin on 27.10.2016.
 */
public class SimpleThrowsAdvice implements ThrowsAdvice {
    public static void main(String[] args) {
        ErrorBean errorBean = new ErrorBean();

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(errorBean);
        pf.addAdvice(new SimpleThrowsAdvice());
        ErrorBean proxy = (ErrorBean) pf.getProxy();
        try {
            proxy.errorProneMethod();
        } catch (Exception ex) {

        }
        try {
            proxy.otherErrorProneMethod();
        } catch (Exception ex) {

        }
    }

    public void afterThrowing(Exception ex) throws Throwable {
        System.out.println("***");
        System.out.println("Generic Exception  Capture");

        System.out.println("Caught:  " + ex.getClass().getName());

        System.out.println("***\n");
    }

    public void afterThrowing(Method method, Object[] args, Object target,
                              IllegalArgumentException ex) throws Throwable {
        System.out.println("***");
        System.out.println("IllegalArgumentException  Capture");

        System.out.println("Caught:  " + ex.getClass().getName());

        System.out.println("Method:  " + method.getName());
        System.out.println("***\n");
    }
}
