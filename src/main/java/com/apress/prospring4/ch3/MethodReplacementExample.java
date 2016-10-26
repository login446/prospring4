package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * Created by admin on 29.09.2016.
 */
public class MethodReplacementExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        ReplacementTarget replacementTarget = (ReplacementTarget) ctx.getBean("replacementTarget");
        ReplacementTarget standardTarget = (ReplacementTarget) ctx.getBean("standardTarget");
        displayInfo(replacementTarget);
        displayInfo(standardTarget);
    }
    private static void displayInfo(ReplacementTarget target){
        System.out.println(target.formatMessage("Hello World!"));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("perfTest");
        for(int i = 0; i < 100000; i++){
            String out = target.formatMessage("foo");
        }
        stopWatch.stop();
        System.out.println("100000 invocations took: " + stopWatch.getTotalTimeMillis() + " ms");
    }
}
