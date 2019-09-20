package io.github.kwahome.creational.abstractfactory.example;

import java.util.ArrayList;
import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.example.factory.AbstractFactory;
import io.github.kwahome.creational.abstractfactory.example.factory.enums.FactoryType;
import io.github.kwahome.creational.abstractfactory.example.shapes.enums.ShapeType;
import io.github.kwahome.creational.abstractfactory.example.factory.AbstractShapeFactory;
import io.github.kwahome.creational.abstractfactory.example.factory.FactoryProvider;
import io.github.kwahome.creational.abstractfactory.example.shapes.GeometricShape;

public class Application {
    public static void main(String []args) {
        System.out.println("2D shapes:");
        System.out.println("----------");
        draw2DShapes();
        System.out.println("\n");

        System.out.println("3D shapes:");
        System.out.println("----------");
        draw3DShapes();
        System.out.println("\n");
    }

    private static void draw2DShapes() {
        ArrayList<ShapeType> shapeTypes = new ArrayList<>();
        shapeTypes.add(ShapeType.CIRCLE);
        shapeTypes.add(ShapeType.LINE);

        // 2D factory
        Optional<AbstractFactory> factoryOptional =
            FactoryProvider.getFactory(FactoryType.TWO_DIMENSION_SHAPE_FACTORY);

        if (factoryOptional.isEmpty()) {
            handleUnknownFactory();
        } else {
            AbstractShapeFactory factory = (AbstractShapeFactory) factoryOptional.get();

            for (ShapeType shapeType: shapeTypes) {
                factory.create(shapeType.name()).ifPresentOrElse(
                    GeometricShape::draw, () -> System.out.println("Shape of given type does not exist"));
            }
        }
    }

    private static void draw3DShapes() {
        ArrayList<ShapeType> shapeTypes = new ArrayList<>();
        shapeTypes.add(ShapeType.PYRAMID);
        shapeTypes.add(ShapeType.SPHERE);

        // 3D factory
        Optional<AbstractFactory> factoryOptional =
            FactoryProvider.getFactory(FactoryType.THREE_DIMENSION_SHAPE_FACTORY);

        if (factoryOptional.isEmpty()) {
            handleUnknownFactory();
        } else {
            AbstractShapeFactory factory = (AbstractShapeFactory) factoryOptional.get();

            for (ShapeType shapeType: shapeTypes) {
                factory.create(shapeType.name()).ifPresentOrElse(
                    GeometricShape::draw, () -> System.out.println("Shape of given type does not exist"));
            }
        }
    }

    private static void handleUnknownFactory() {
        System.out.println("Factory of given type does not exist.");
        System.exit(1);
    }
}
