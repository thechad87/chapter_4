package com.example.demo.ooprinciples;

import com.example.demo.DemoApplicationTests;
import com.example.demo.Surname;
import org.junit.Test;

public class InheritanceTests extends DemoApplicationTests {

    @Test
    public void testInheritance() {
        Surname surname = new Surname();
        surname.setEnforceUppercase(true);
        surname.setValue("somesurname");

        assert surname.getValue().equals("somesurname".toUpperCase());
    }
}
