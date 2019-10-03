package io.github.kwahome.structural.flyweight.example.racecar;

public interface RaceCar {
    /* Extrinsic state is stored or computed by client objects, and passed to the Flyweight.*/
    void moveCar(final int currentX, final int currentY, final int newX, final int newY);
}
