package io.github.kwahome.creational.abstractfactory.example;

import java.util.ArrayList;
import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.example.animals.Animal;
import io.github.kwahome.creational.abstractfactory.example.animals.enums.AnimalType;
import io.github.kwahome.creational.abstractfactory.example.colors.Color;
import io.github.kwahome.creational.abstractfactory.example.colors.enums.ColorType;
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

        System.out.println("Colors:");
        System.out.println("----------");
        showColors();
        System.out.println("\n");

        System.out.println("Animal Sounds:");
        System.out.println("----------");
        makeAnimalSounds();
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

    private static void makeAnimalSounds() {
        ArrayList<AnimalType> animalTypes = new ArrayList<>();
        animalTypes.add(AnimalType.DOG);
        animalTypes.add(AnimalType.DUCK);

        Optional<AbstractFactory> factoryOptional = FactoryProvider.getFactory(FactoryType.ANIMAL_FACTORY);
        if (factoryOptional.isEmpty()) {
            handleUnknownFactory();
        } else {
            AbstractFactory<Animal> factory = factoryOptional.get();
            for (AnimalType animalType: animalTypes) {
                factory.create(animalType.value()).ifPresentOrElse(
                    Animal::makeSound, () -> System.out.println("Animal of given type does not exist")
                );
            }
        }
    }

    private static void showColors() {
        ArrayList<ColorType> colorTypes = new ArrayList<>();
        colorTypes.add(ColorType.BLACK);
        colorTypes.add(ColorType.BROWN);
        colorTypes.add(ColorType.WHITE);

        Optional<AbstractFactory> factoryOptional = FactoryProvider.getFactory(FactoryType.COLOR_FACTORY);
        if (factoryOptional.isEmpty()) {
            handleUnknownFactory();
        } else {
            AbstractFactory<Color> factory = factoryOptional.get();
            for (ColorType colorType: colorTypes) {
                factory.create(colorType.value()).ifPresentOrElse(
                    Color::showColor, () -> System.out.println("Color of given type does not exist")
                );
            }
        }
    }

    private static void handleUnknownFactory() {
        System.out.println("Factory of given type does not exist.");
        System.exit(1);
    }
}
