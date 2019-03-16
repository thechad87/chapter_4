package com.example.demo.oo.interfaces;

/**
 * 1. There is VERY little difference between an abstract METHOD and an interface METHOD. What can be said
 *    is that an abstract method method is only applied to the subclasses of this abstract method, while
 *    an interface METHOD can be applied to any Dick, Tom and Harry class.
 */
public interface Session {

    void validate() throws IllegalArgumentException;

}
