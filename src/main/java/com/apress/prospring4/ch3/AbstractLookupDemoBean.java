package com.apress.prospring4.ch3;

/**
 * Created by admin on 28.09.2016.
 */
public abstract class AbstractLookupDemoBean implements DemoBean {
    public abstract MyHelper getMyHelper();

    @Override
    public void someOperation() {
        getMyHelper().doSomethingHelpful();
    }
}
