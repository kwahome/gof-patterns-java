package io.github.kwahome.creational.abstractfactory.example.colors.enums;

public enum ColorType {
    BLACK("Black"),
    BROWN("Brown"),
    WHITE("White");

    private final String value;

    ColorType(final String colorType) {
        this.value = colorType;
    }

    public String value() {
        return value;
    }
}
