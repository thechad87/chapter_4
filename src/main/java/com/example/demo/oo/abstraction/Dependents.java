package com.example.demo.oo.abstraction;

public class Dependents extends AbstractRequest {

    public Dependents(String sessionId) {
        super(sessionId);
    }

    @Override
    protected void validate() throws IllegalArgumentException {
        // nothing to do here.
    }
}
