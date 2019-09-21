package io.github.kwahome.creational.builder.example.nested.person;

public class Application {
    public static void main(String []args) {
        System.out.println("Building person:");
        System.out.println("----------------");
        Person person = new Person.PersonBuilder("Jane", "Doe")
            .age(30)
            .phone("081-555-1667")
            .address("Mombasa, KE")
            .build();
        System.out.println("Built person: " + person.toString());
    }
}
