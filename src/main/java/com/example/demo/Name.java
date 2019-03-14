package com.example.demo;

public class Name{

    private boolean enforceUppercase;
    private String value;

    public String getValue() {
        return enforceUppercase ? value.toUpperCase() : value;
    }

    public String getType() {
        return "NAME";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isEnforceUppercase() {
        return enforceUppercase;
    }

    public void setEnforceUppercase(boolean enforceUppercase) {
        this.enforceUppercase = enforceUppercase;
    }
}
