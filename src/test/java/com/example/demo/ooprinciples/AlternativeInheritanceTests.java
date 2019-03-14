package com.example.demo.ooprinciples;

import com.example.demo.DemoApplicationTests;
import com.example.demo.NameWrapper;
import org.junit.Test;

public class AlternativeInheritanceTests extends DemoApplicationTests {

    @Test
    public void testAlternativeInheritance() {
        NameWrapper nameWrapper = new NameWrapper("susan", "somesurname");

        assert nameWrapper.getName().equals("susan");
        assert nameWrapper.getSurname().equals("somesurname");

    }
}
