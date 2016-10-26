package com.apress.prospring4.ch4;

import java.beans.PropertyEditorSupport;

/**
 * Created by admin on 05.10.2016.
 */
public class NamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] name = text.split("\\s");
        setValue(new Name(name[0], name[1]));
    }
}
