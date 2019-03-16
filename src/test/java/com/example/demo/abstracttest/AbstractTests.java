package com.example.demo.abstracttest;

import com.example.demo.oo.abstraction.DependentPayment;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Test;

import java.math.BigDecimal;

public class AbstractTests {

    @Test
    public void testAbstractsSuccessfully() throws InvalidArgumentException {
        DependentPayment dependentPayment = new DependentPayment("123", 1, BigDecimal.TEN);
        dependentPayment.validateRequest();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbstractsFail() throws InvalidArgumentException {
        DependentPayment dependentPayment = new DependentPayment(null, 1, BigDecimal.TEN);
        dependentPayment.validateRequest();

        //payBeneficiary.validate() HIDDEN FROM DEVELOPER
    }
}
