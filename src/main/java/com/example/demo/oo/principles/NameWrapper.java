package com.example.demo.oo.principles;

public class NameWrapper {

    private Name name;
    private Surname surname;

    public NameWrapper(String name, String surname) {
        this.name = new Name();
        this.name.setValue(name);

        this.surname = new Surname();
        this.surname.setValue(surname);
    }

    public String getName() {
        return name.getValue();
    }

    public String getSurname() {
        return surname.getValue();
    }
}
