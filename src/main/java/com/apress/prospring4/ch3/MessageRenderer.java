package com.apress.prospring4.ch3;

/**
 * Created by admin on 21.09.2016.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
