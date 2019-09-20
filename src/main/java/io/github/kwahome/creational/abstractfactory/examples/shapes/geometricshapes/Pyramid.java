package io.github.kwahome.creational.abstractfactory.examples.shapes.geometricshapes;

/**
 * Square concrete product
 */
public class Pyramid implements GeometricShape {

    @Override
    public void draw() {
        System.out.println("Pyramid");
    }
}
