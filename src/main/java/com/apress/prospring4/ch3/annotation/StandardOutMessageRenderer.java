package com.apress.prospring4.ch3.annotation;

import com.apress.prospring4.ch3.MessageProvider;
import com.apress.prospring4.ch3.MessageRenderer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by admin on 21.09.2016.
 */
@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;
    @Override
    public void render() {
        if(messageProvider == null){
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                    + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Resource(name="messageProvider2")
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
