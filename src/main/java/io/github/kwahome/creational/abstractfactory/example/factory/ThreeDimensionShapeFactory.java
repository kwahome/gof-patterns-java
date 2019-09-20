package io.github.kwahome.creational.abstractfactory.example.factory;

import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.example.shapes.enums.ShapeType;
import io.github.kwahome.creational.abstractfactory.example.shapes.GeometricShape;
import io.github.kwahome.creational.abstractfactory.example.shapes.Pyramid;
import io.github.kwahome.creational.abstractfactory.example.shapes.Sphere;

/**
 * Concrete factory
 */
public class ThreeDimensionShapeFactory extends AbstractShapeFactory {

    @Override
    public Optional<GeometricShape> create(final String type) {
        if (type.equals(ShapeType.PYRAMID.name())) {
            return Optional.of(new Pyramid());
        }

        if (type.equals(ShapeType.SPHERE.name())) {
            return Optional.of(new Sphere());
        }
        return Optional.empty();
    }
}
