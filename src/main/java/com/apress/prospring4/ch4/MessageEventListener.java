package com.apress.prospring4.ch4;

import org.springframework.context.ApplicationListener;

/**
 * Created by alex on 05.10.2016.
 */
public class MessageEventListener implements ApplicationListener<MessageEvent> {
    @Override
    public void onApplicationEvent(MessageEvent messageEvent) {
        MessageEvent msgEvt = (MessageEvent) messageEvent;
        System.out.println("Received: " + msgEvt.getMsg());
    }
}
