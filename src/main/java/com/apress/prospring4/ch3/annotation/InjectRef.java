package com.apress.prospring4.ch3.annotation;

import com.apress.prospring4.ch3.Oracle;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by admin on 22.09.2016.
 */
@Service("injectRef")
public class InjectRef {
    private Oracle oracle2;
    @Resource(name="oracle")
    public void setOracle(Oracle oracle){
        this.oracle2 = oracle;
    }

    @Override
    public String toString() {
        return oracle2.defineMeaningOfLife();
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        InjectRef injectRef = (InjectRef) ctx.getBean("injectRef");
        System.out.println(injectRef);
    }
}
