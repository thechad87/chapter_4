package com.example.demo.oo.abstractdemo;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class ListBeneficiary extends AbstractRequest {

    public ListBeneficiary(String sessionId) {
        super(sessionId);
    }

    @Override
    protected void validate() throws InvalidArgumentException {
        // nothing to do here.
    }
}
