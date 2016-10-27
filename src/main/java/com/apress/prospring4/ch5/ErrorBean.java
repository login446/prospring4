package com.apress.prospring4.ch5;

/**
 * Created by admin on 27.10.2016.
 */
public class ErrorBean {
    public void errorProneMethod() throws Exception {
        throw new Exception("Foo");
    }
    public void otherErrorProneMethod() throws IllegalArgumentException{
        throw new IllegalArgumentException("Bar");
    }
}
