package io.github.kwahome.creational.abstractfactory.example.shapes;

/**
 * Circle concrete product
 */
public class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
