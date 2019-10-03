package io.github.kwahome.structural.flyweight.example.racecar;

import java.util.Random;

import io.github.kwahome.structural.flyweight.example.racecar.enums.RaceCarType;

public class Application {
    public static void main(String []args) {

        System.out.println("Race Car Flyweight:");
        System.out.println("-------------------");
        RaceCarClient[] raceCars = {
            new RaceCarClient(RaceCarType.MIDGET),
            new RaceCarClient(RaceCarType.MIDGET),
            new RaceCarClient(RaceCarType.MIDGET),
            new RaceCarClient(RaceCarType.SPRINT),
            new RaceCarClient(RaceCarType.SPRINT),
            new RaceCarClient(RaceCarType.SPRINT)
        };

        for (RaceCarClient raceCar: raceCars) {
            int x = new Random().nextInt(100);
            int y = new Random().nextInt(100);
            raceCar.moveCar(x, y);
        }

        System.out.println("\n");

    }
}
