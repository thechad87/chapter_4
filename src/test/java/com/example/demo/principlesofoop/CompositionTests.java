package com.example.demo.principlesofoop;

import com.example.demo.DemoApplicationTests;
import com.example.demo.oo.principles.NamePackage;
import org.junit.Test;

public class CompositionTests extends DemoApplicationTests {

    @Test
    public void testComposition() {
        NamePackage namePackage = new NamePackage("susan", "somesurname");

        assert namePackage.getName().equals("susan");
        assert namePackage.getSurname().equals("somesurname");

    }
}
