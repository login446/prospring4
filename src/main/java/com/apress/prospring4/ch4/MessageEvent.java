package com.apress.prospring4.ch4;

import org.springframework.context.ApplicationEvent;

/**
 * Created by alex on 05.10.2016.
 */
public class MessageEvent extends ApplicationEvent {
    private String msg;

    public MessageEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
