package io.github.kwahome.creational.abstractfactory.example.factory;

import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.example.factory.enums.FactoryType;

public class FactoryProvider {
    public static Optional<AbstractFactory> getFactory(final FactoryType factoryType) {
        Optional<AbstractFactory> factoryOptional;
        switch (factoryType) {
            case ANIMAL_FACTORY:
                factoryOptional = Optional.of(new AnimalFactory());
                break;
            case COLOR_FACTORY:
                factoryOptional = Optional.of(new ColorFactory());
                break;
            case TWO_DIMENSION_SHAPE_FACTORY:
                factoryOptional = Optional.of(new TwoDimensionShapeFactory());
                break;
            case THREE_DIMENSION_SHAPE_FACTORY:
                factoryOptional = Optional.of(new ThreeDimensionShapeFactory());
                break;
            default:
                factoryOptional = Optional.empty();
        }
        return factoryOptional;
    }
}
