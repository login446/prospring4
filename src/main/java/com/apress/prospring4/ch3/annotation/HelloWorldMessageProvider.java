package com.apress.prospring4.ch3.annotation;

import com.apress.prospring4.ch3.MessageProvider;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 21.09.2016.
 */
@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
