package com.example.demo.abstractdemo;

import com.example.demo.oo.abstractdemo.PayBeneficiary;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Test;

import java.math.BigDecimal;

public class AbstractTests {

    @Test
    public void testAbstractsSuccessfully() throws InvalidArgumentException {
        PayBeneficiary payBeneficiary = new PayBeneficiary("123", 1, BigDecimal.TEN);
        payBeneficiary.validateRequest();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbstractsFail() throws InvalidArgumentException {
        PayBeneficiary payBeneficiary = new PayBeneficiary(null, 1, BigDecimal.TEN);
        payBeneficiary.validateRequest();

        //payBeneficiary.validate() HIDDEN FROM DEVELOPER
    }
}
