package com.example.demo.oo.abstraction;

/**
 *  1. implementing class can derive only from one abstract class
 *      (a class can inherit more than one interface)
 *
 *  2. extending an abstract can dictate constructor implementation
 *      (interface can't do this)
 */

//1
public class RemoveDependents extends AbstractRequest {

    private Integer benefiaryNo;

    public RemoveDependents(String sessionId, Integer benefiaryNo) {
        super(sessionId);       //2

        this.benefiaryNo = benefiaryNo;
    }

    @Override
    protected void validate() throws IllegalArgumentException {
        if (benefiaryNo == null || benefiaryNo.intValue() == 0) {
            throw new IllegalArgumentException("benefiaryNo is invalid");
        }
    }
}
