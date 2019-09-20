package io.github.kwahome.creational.abstractfactory.example.shapes;

/**
 * Square concrete product
 */
public class Pyramid implements GeometricShape {

    @Override
    public void draw() {
        System.out.println("Pyramid");
    }
}
