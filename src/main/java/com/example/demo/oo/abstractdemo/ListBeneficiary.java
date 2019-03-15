package com.example.demo.oo.abstractdemo;

public class ListBeneficiary extends AbstractRequest {

    public ListBeneficiary(String sessionId) {
        super(sessionId);
    }

    @Override
    protected void validate() throws IllegalArgumentException {
        // nothing to do here.
    }
}
