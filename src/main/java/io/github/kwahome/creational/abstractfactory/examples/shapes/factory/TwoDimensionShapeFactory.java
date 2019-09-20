package io.github.kwahome.creational.abstractfactory.examples.shapes.factory;

import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.examples.shapes.enums.ShapeType;
import io.github.kwahome.creational.abstractfactory.examples.shapes.geometricshapes.Circle;
import io.github.kwahome.creational.abstractfactory.examples.shapes.geometricshapes.GeometricShape;
import io.github.kwahome.creational.abstractfactory.examples.shapes.geometricshapes.Line;

/**
 * Concrete factory
 */
public class TwoDimensionShapeFactory implements AbstractShapeFactory {
    @Override
    public Optional<GeometricShape> getShape(final ShapeType name) {
        switch (name) {
            case LINE:
                return Optional.of(new Line());
            case CIRCLE:
                return Optional.of(new Circle());
            default:
                return Optional.empty();
        }
    }
}
