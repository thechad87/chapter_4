package com.example.demo.ooprinciples;

import com.example.demo.DemoApplicationTests;
import com.example.demo.Name;
import com.example.demo.Surname;
import org.junit.Test;

public class PolymorphismTests extends DemoApplicationTests {

    @Test
    public void testPolymorphism() {
        Name name = new Name();
        name.setEnforceUppercase(true);
        name.setValue("susan");

        Surname surname = new Surname();
        surname.setEnforceUppercase(true);
        surname.setValue("somesurname");

        assert name.getType().equals("NAME");
        assert surname.getType().equals("SURNAME");
    }
}
