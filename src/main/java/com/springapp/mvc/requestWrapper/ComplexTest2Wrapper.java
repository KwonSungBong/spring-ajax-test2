package com.springapp.mvc.requestWrapper;

import com.springapp.mvc.model.Reply;

import java.util.HashMap;

public class ComplexTest2Wrapper {
    HashMap<String, Reply> complexObject;

    public HashMap<String, Reply> getComplexObject() {
        return complexObject;
    }

    public void setComplexObject(HashMap<String, Reply> complexObject) {
        this.complexObject = complexObject;
    }
}
