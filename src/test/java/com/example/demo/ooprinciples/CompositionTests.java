package com.example.demo.ooprinciples;

import com.example.demo.DemoApplicationTests;
import com.example.demo.oo.principles.NameWrapper;
import org.junit.Test;

public class CompositionTests extends DemoApplicationTests {

    @Test
    public void testComposition() {
        NameWrapper nameWrapper = new NameWrapper("susan", "somesurname");

        assert nameWrapper.getName().equals("susan");
        assert nameWrapper.getSurname().equals("somesurname");

    }
}
