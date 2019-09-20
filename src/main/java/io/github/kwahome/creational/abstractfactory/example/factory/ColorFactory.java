package io.github.kwahome.creational.abstractfactory.example.factory;

import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.example.colors.Black;
import io.github.kwahome.creational.abstractfactory.example.colors.Brown;
import io.github.kwahome.creational.abstractfactory.example.colors.Color;
import io.github.kwahome.creational.abstractfactory.example.colors.White;
import io.github.kwahome.creational.abstractfactory.example.colors.enums.ColorType;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Optional<Color> create(final String colorType) {
        if (colorType.equals(ColorType.BLACK.value())) {
            return Optional.of(new Black());
        }

        if (colorType.equals(ColorType.BROWN.value())) {
            return Optional.of(new Brown());
        }

        if (colorType.equals(ColorType.WHITE.value())) {
            return Optional.of(new White());
        }
        return Optional.empty();
    }
}
