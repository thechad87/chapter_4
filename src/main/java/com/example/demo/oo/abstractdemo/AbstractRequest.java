package com.example.demo.oo.abstractdemo;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 1. There is VERY little difference between an abstract METHOD and an interface METHOD. What can be said
 *    is that an abstract method method is only applied to the subclasses of this abstract method, while
 *    an interface METHOD can be applied to any Dick, Tom and Harry class.
 *
 * 2. abstract methods can be made public, default or protected. Interfaces methods are always public.
 *
 * 3. protected abstract methods makes a lot of sense for abstract classes, because you're hiding the method
 *    from the user of this class, which is the entent of most abstract classes .ie creating an 'engine' but
 *    hiding the details from the developer using the class and using public methods to show the developer
 *    how to use this 'engine.
 *
 *    See unit test cases.
 *
 * 4. The main benefit of creating abstract classes is to have control over its subclasses - creating a type of engine
 *    if you will. You could ask why not just create a normal Java base class? The reason for that is that it is
 *    impossible to create an instance of an Abstract class which is what you want with the 'engine' approach.
 */
public abstract class AbstractRequest {

    private String sessionId;
    private LocalDate localDate = LocalDate.now();

    //4 (We want an abstract class and not have the developer create an instance of AbstractRequest to prevent
    //  abuse and to keep this 'engine' seperate from the Base classes of this class.
    public AbstractRequest(String sessionId) {
        if (sessionId == null || sessionId.isEmpty()) {
            throw new IllegalArgumentException("SessionId is invalid");
        }

        this.sessionId = sessionId;
    }

    // 1
    // 2
    protected abstract void validate() throws IllegalArgumentException;

    public void validateRequest() throws IllegalArgumentException {

        //3
        // fail on Mondays
        if (localDate.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
            throw new IllegalArgumentException("Not allowed");
        }

        validate();
    }

}
