package io.github.kwahome.creational.abstractfactory.examples.shapes.geometricshapes;

/**
 * Circle concrete product
 */
public class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
