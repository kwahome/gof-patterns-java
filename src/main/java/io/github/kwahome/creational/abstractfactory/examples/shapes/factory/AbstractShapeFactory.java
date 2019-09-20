package io.github.kwahome.creational.abstractfactory.examples.shapes.factory;

import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.examples.shapes.enums.ShapeType;
import io.github.kwahome.creational.abstractfactory.examples.shapes.geometricshapes.GeometricShape;

/**
 * Abstract Factory interface
 */
public interface AbstractShapeFactory {
    Optional<GeometricShape> getShape(final ShapeType name);
}
