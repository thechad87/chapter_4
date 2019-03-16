package com.example.demo.oo.abstraction;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class AbstractRequest {

    private String userID;
    private LocalDate localDate = LocalDate.now();


    public AbstractRequest(String userID) {
        if (userID == null || userID.isEmpty()) {
            throw new IllegalArgumentException("SessionId is invalid");
        }
        this.userID = userID;
    }

    protected abstract void validate() throws IllegalArgumentException;

    public void validateRequest() throws IllegalArgumentException {
        if (localDate.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
            throw new IllegalArgumentException("Not allowed");
        }
        validate();
    }

}
