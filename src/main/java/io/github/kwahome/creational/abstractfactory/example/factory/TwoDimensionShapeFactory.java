package io.github.kwahome.creational.abstractfactory.example.factory;

import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.example.shapes.enums.ShapeType;
import io.github.kwahome.creational.abstractfactory.example.shapes.Circle;
import io.github.kwahome.creational.abstractfactory.example.shapes.GeometricShape;
import io.github.kwahome.creational.abstractfactory.example.shapes.Line;

/**
 * Concrete factory
 */
public class TwoDimensionShapeFactory extends AbstractShapeFactory {

    @Override
    public Optional<GeometricShape> create(final String shapeType) {
        if (shapeType.equals(ShapeType.CIRCLE.name())) {
            return Optional.of(new Circle());
        }

        if (shapeType.equals(ShapeType.LINE.name())) {
            return Optional.of(new Line());
        }
        return Optional.empty();
    }
}
