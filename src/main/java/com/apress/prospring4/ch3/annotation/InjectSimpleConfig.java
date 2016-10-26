package com.apress.prospring4.ch3.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by admin on 22.09.2016.
 */
@Component("injectSimpleConfig")
public class InjectSimpleConfig {
    private String name = "Bobi";
    private int age = 34;
    private float height = 1.44f;
    private boolean programmer = true;
    private Long ageInSeconds = 1009843200L;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }
}
