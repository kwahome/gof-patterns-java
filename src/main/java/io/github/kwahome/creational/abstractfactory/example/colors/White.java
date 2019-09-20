package io.github.kwahome.creational.abstractfactory.example.colors;

import io.github.kwahome.creational.abstractfactory.example.colors.enums.ColorType;

public class White implements Color {

    @Override
    public String getColor() {
        return ColorType.WHITE.value();
    }

    @Override
    public void showColor() {
        System.out.println(this.getColor());
    }
}
