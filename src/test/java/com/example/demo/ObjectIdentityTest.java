package com.example.demo;

import org.junit.Test;

public class ObjectIdentityTest extends DemoApplicationTests {

    @Test
    public void testObjectIdentitySucceeds() {
        Object o1 = new Object();
        Object o2 = o1;

        assert o1 == o2;
    }

    @Test
    public void testObjectIdentityFails() {
        Integer integer1 = new Integer("1");
        Integer integer2 = new Integer("1");

        assert integer1 != integer2;
    }
}
