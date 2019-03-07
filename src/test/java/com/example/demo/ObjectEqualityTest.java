package com.example.demo;

import org.junit.Test;

public class ObjectEqualityTest extends DemoApplicationTests {

    @Test
    public void testObjectEqualitySucceeds() {
        Object o1 = new Object();
        Object o2 = o1;

        assert o1.equals(o2);
    }

    @Test
    public void testObjectEqualityFails() {
        Object o1 = new Object();
        Object o2 = new Object();

        assert !o1.equals(o2);
    }

}
