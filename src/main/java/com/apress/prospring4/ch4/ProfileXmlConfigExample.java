package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by admin on 11.10.2016.
 */
public class ProfileXmlConfigExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("highschool");
        ctx.load("classpath:spring/*-config.xml");
        ctx.refresh();

        FoodProviderService foodProviderService = (FoodProviderService) ctx.getBean("foodProviderService");
        List<Food> lunchSet = foodProviderService.provideLunchSet();
        for(Food food : lunchSet)
            System.out.println(food.getName());
    }
}
