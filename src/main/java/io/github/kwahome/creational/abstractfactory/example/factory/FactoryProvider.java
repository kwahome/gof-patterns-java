package io.github.kwahome.creational.abstractfactory.example.factory;

import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.example.factory.enums.FactoryType;

public class FactoryProvider {
    public static Optional<AbstractFactory> getFactory(final FactoryType factoryType) {
        switch (factoryType) {
            case ANIMAL_FACTORY:
                return Optional.of(new AnimalFactory());
            case COLOR_FACTORY:
                return Optional.of(new ColorFactory());
            case TWO_DIMENSION_SHAPE_FACTORY:
                return Optional.of(new TwoDimensionShapeFactory());
            case THREE_DIMENSION_SHAPE_FACTORY:
                return Optional.of(new ThreeDimensionShapeFactory());
            default:
                return Optional.empty();
        }
    }
}
