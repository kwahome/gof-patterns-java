package io.github.kwahome.creational.abstractfactory.examples.shapes;

import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.examples.shapes.enums.FactoryType;
import io.github.kwahome.creational.abstractfactory.examples.shapes.enums.ShapeType;
import io.github.kwahome.creational.abstractfactory.examples.shapes.factory.AbstractShapeFactory;
import io.github.kwahome.creational.abstractfactory.examples.shapes.factory.FactoryProvider;
import io.github.kwahome.creational.abstractfactory.examples.shapes.geometricshapes.GeometricShape;

public class ShapeApplication {
    public static void main(String []args) {
        // 2D factory
        Optional<AbstractShapeFactory> factoryOptional =
            FactoryProvider.getFactory(FactoryType.TWO_DIMENSION_SHAPE_FACTORY);
        if (factoryOptional.isEmpty()) {
            System.out.println("Factory of given type does not exist.");
            System.exit(1);
        }
        AbstractShapeFactory factory = factoryOptional.get();
        drawShape(factory.getShape(ShapeType.LINE));
        drawShape(factory.getShape(ShapeType.CIRCLE));

        // 3D factory
        factoryOptional = FactoryProvider.getFactory(FactoryType.THREE_DIMENSION_SHAPE_FACTORY);
        if (factoryOptional.isEmpty()) {
            System.out.println("Factory of given type does not exist.");
            System.exit(1);
        }
        factory = factoryOptional.get();
        drawShape(factory.getShape(ShapeType.PYRAMID));
        drawShape(factory.getShape(ShapeType.SPHERE));
    }

    private static void drawShape(final Optional<GeometricShape> geometricShape) {
        if (geometricShape.isPresent()) {
            geometricShape.get().draw();
        } else {
            System.out.println("Shape of given type does not exist");
        }
    }
}
