package com.apress.prospring4.ch4;

import com.apress.prospring4.ch3.MessageProvider;

/**
 * Created by admin on 06.10.2016.
 */
public class ConfigurableMessageProvider implements MessageProvider {
    private String message = "Default message";

    public ConfigurableMessageProvider() {

    }

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
