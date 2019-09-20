package io.github.kwahome.creational.abstractfactory.example.shapes;

public class Sphere implements GeometricShape{
    @Override
    public void draw() {
        System.out.println("Sphere");
    }
}
