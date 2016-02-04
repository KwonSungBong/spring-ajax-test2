package com.springapp.mvc.requestWrapper;

import java.util.ArrayList;
import java.util.HashMap;

public class ComplexTestWrapper {
    private HashMap<String, ArrayList<HashMap<String,String>>> complexObject;

    public HashMap<String, ArrayList<HashMap<String, String>>> getComplexObject() {
        return complexObject;
    }

    public void setComplexObject(HashMap<String, ArrayList<HashMap<String, String>>> complexObject) {
        this.complexObject = complexObject;
    }
}
