package io.github.kwahome.creational.builder.example.person;

public class Application {
    public static void main(String []args) {
        System.out.println("Building person:");
        System.out.println("----------------");
        Person person = new PersonBuilder()
            .firstName("John")
            .lastName("Doe")
            .age(50)
            .phone("081-555-1667")
            .address("Nairobi")
            .build();
        System.out.println("Built person: " + person.toString());
    }
}
