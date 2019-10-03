package io.github.kwahome.structural.flyweight.example.racecar;

import java.util.Optional;

import io.github.kwahome.structural.flyweight.example.racecar.enums.RaceCarType;

public class RaceCarClient {
    private Optional<RaceCar> optionalRaceCar;
    /**
     * The extrinsic state of the flyweight is maintained by the client
     */
    private int currentX = 0;
    private int currentY = 0;

    public RaceCarClient(final RaceCarType raceCarType) {
        /*Ask factory for a RaceCar*/
        optionalRaceCar = CarFactory.getRaceCar(raceCarType);
    }

    public void moveCar(final int newX, final int newY) {
        /*Car movement is handled by the flyweight object*/
        this.optionalRaceCar.ifPresentOrElse(
            raceCar -> raceCar.moveCar(currentX, currentY, newX, newY),
            () -> System.out.println("Race car does not exist"));

        currentX = newX;
        currentY = newY;
    }
}
