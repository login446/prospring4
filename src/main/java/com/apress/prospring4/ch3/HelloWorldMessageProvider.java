package com.apress.prospring4.ch3;

/**
 * Created by admin on 21.09.2016.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
