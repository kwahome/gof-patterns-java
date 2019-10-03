package io.github.kwahome.structural.flyweight.example.racecar.enums;

public enum RaceCarType {
    MIDGET("Midget"),
    SPRINT("Sprint");

    private final String value;

    RaceCarType(final String carType) {
        this.value = carType;
    }

    public String value() {
        return value;
    }
}
