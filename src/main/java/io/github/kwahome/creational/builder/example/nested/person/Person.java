package io.github.kwahome.creational.builder.example.nested.person;

public final class Person {
    // mandatory
    private final String firstName;
    private final String lastName;
    // optional
    private final int age;
    private final String phone;
    private final String address;

    public static class PersonBuilder {
        // mandatory
        private final String firstName;
        private final String lastName;
        // optional
        private int age;
        private String phone;
        private String address;

        public PersonBuilder(final String firstName, final String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
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
            return new Person(this);
        }
    }

    private Person(final PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.age = personBuilder.age;
        this.phone = personBuilder.phone;
        this.address = personBuilder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            ", phone='" + phone + '\'' +
            ", address='" + address + '\'' +
            '}';
    }
}
