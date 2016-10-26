package com.apress.prospring4.ch4;

import com.apress.prospring4.ch3.MessageProvider;

/**
 * Created by admin on 06.10.2016.
 */
public interface MessageRenderer {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
