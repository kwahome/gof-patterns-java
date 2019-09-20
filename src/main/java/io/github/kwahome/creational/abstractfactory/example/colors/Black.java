package io.github.kwahome.creational.abstractfactory.example.colors;

import io.github.kwahome.creational.abstractfactory.example.colors.enums.ColorType;

public class Black implements Color{

    @Override
    public String getColor() {
        return ColorType.BLACK.value();
    }
}
