package io.github.kwahome.creational.abstractfactory.example.shapes;

/**
 * Concrete line product
 */
public class Line implements GeometricShape {

    @Override
    public void draw() {
        System.out.println("Line");
    }
}
