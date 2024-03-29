package com.example.demo.principlesofoop;

import com.example.demo.DemoApplicationTests;
import com.example.demo.oo.principles.Name;
import org.junit.Test;

public class EncapsulationTests extends DemoApplicationTests {

    @Test
    public void testEncapsulation() {
        Name name = new Name();
        name.setEnforceUppercase(true);
        name.setValue("susan");

        assert name.getValue().equals("susan".toUpperCase());
    }
}
