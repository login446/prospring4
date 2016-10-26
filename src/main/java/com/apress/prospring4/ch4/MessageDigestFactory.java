package com.apress.prospring4.ch4;

import java.security.MessageDigest;

/**
 * Created by admin on 04.10.2016.
 */
public class MessageDigestFactory {
    private String algorithmName = "MD5";

    public MessageDigest createInstance() throws Exception {
        return MessageDigest.getInstance(algorithmName);
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }
}
