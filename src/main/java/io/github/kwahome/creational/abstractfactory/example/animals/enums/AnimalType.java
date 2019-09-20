package io.github.kwahome.creational.abstractfactory.example.animals.enums;

public enum AnimalType {
    DOG("Dog"),
    DUCK("Duck");

    private final String value;

    AnimalType(final String animalType) {
        this.value = animalType;
    }

    public String value() {
        return value;
    }
}
