package com.apress.prospring4.ch3;

/**
 * Created by admin on 22.09.2016.
 */
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;
    public ConfigurableMessageProvider(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
