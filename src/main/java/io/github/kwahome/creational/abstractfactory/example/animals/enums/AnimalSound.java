package io.github.kwahome.creational.abstractfactory.example.animals.enums;

public enum AnimalSound {
    BARK("Bark"),
    SQUEAK("Squeak");

    private final String value;

    AnimalSound(final String animalSound) {
        this.value = animalSound;
    }

    public String value() {
        return this.value;
    }
}
