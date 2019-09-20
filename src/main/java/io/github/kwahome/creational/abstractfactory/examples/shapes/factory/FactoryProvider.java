package io.github.kwahome.creational.abstractfactory.examples.shapes.factory;

import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.examples.shapes.enums.FactoryType;

public class FactoryProvider {
    public static Optional<AbstractShapeFactory> getFactory(final FactoryType factoryType) {
        switch (factoryType) {
            case TWO_DIMENSION_SHAPE_FACTORY:
                return Optional.of(new TwoDimensionShapeFactory());
            case THREE_DIMENSION_SHAPE_FACTORY:
                return Optional.of(new ThreeDimensionShapeFactory());
            default:
                return Optional.empty();
        }
    }
}
