package com.apress.prospring4.ch3.annotation;

import com.apress.prospring4.ch3.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by admin on 22.09.2016.
 */
@Service("messageProvider2")
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;
    @Autowired
    public ConfigurableMessageProvider(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
