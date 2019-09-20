package io.github.kwahome.creational.builder.example.person;

public class Person {
    private final String firstName; // mandatory
    private final String lastName; // mandatory
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    public Person(final String firstName,
                  final String lastName,
                  final int age,
                  final String phone,
                  final String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
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
