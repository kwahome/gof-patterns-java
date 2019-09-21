package io.github.kwahome.creational.builder.example.nonnested.person;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    public PersonBuilder() {
    }

    public PersonBuilder firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder lastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder age(final int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder phone(final String phone) {
        this.phone = phone;
        return this;
    }

    public PersonBuilder address(final String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(firstName, lastName, age, phone, address);
    }
}
