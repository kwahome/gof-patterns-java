package io.github.kwahome.creational.abstractfactory.examples.shapes.factory;

import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.examples.shapes.enums.ShapeType;
import io.github.kwahome.creational.abstractfactory.examples.shapes.geometricshapes.GeometricShape;
import io.github.kwahome.creational.abstractfactory.examples.shapes.geometricshapes.Pyramid;
import io.github.kwahome.creational.abstractfactory.examples.shapes.geometricshapes.Sphere;

/**
 * Concrete factory
 */
public class ThreeDimensionShapeFactory implements AbstractShapeFactory {
    @Override
    public Optional<GeometricShape> getShape(final ShapeType name) {
        switch (name) {
            case PYRAMID:
                return Optional.of(new Pyramid());
            case SPHERE:
                return Optional.of(new Sphere());
            default:
                return Optional.empty();
        }
    }
}
