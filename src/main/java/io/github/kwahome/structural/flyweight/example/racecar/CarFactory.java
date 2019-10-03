package io.github.kwahome.structural.flyweight.example.racecar;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import io.github.kwahome.structural.flyweight.example.racecar.enums.RaceCarType;

public class CarFactory {

    private static Map<String, RaceCar> flyweights = new HashMap<>();

    public static Optional<RaceCar> getRaceCar(final RaceCarType raceCarType) {
        Optional<RaceCar> optionalRaceCar = Optional.empty();

        /* if race car type exist, return flyweight from Map*/
        if (flyweights.containsKey(raceCarType.value())) {
            optionalRaceCar = Optional.of(flyweights.get(raceCarType.value()));
        } else {
            /* if race car type does not exist in Map, create flyweight, put it in Map, and return the object*/
            RaceCar raceCar = createRaceCar(raceCarType);
            if (Objects.nonNull(raceCar)) {
                flyweights.put(raceCarType.value(), raceCar);
                optionalRaceCar = Optional.of(raceCar);
            }
        }
        return optionalRaceCar;
    }

    private static RaceCar createRaceCar(final RaceCarType raceCarType) {
        RaceCar raceCar;
        switch (raceCarType) {
            case MIDGET:
                raceCar = new FlyweightMidgetCar("Midget Car", 140, 400);
                break;
            case SPRINT:
                raceCar = new FlyweightSprintCar("Spring Car", 160, 1000);
                break;
            default:
                raceCar = null;
        }
        return raceCar;
    }
}
