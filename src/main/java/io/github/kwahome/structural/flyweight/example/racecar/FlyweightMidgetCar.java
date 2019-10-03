package io.github.kwahome.structural.flyweight.example.racecar;

public class FlyweightMidgetCar extends AbstractRaceCar {

    private static int count; // track number of flyweight instantiation

    public FlyweightMidgetCar(final String name, final int speed, final int horsePower ) {
        super(name, speed, horsePower);
        count++;
    }

    /**
     * This method accepts car location (extrinsic).
     *
     * No reference to current or new location is maintained inside the flyweight implementation
     *
     * @param currentX current X
     * @param currentY current Y
     * @param newX new X
     * @param newY new Y
     */
    @Override
    public void moveCar(int currentX, int currentY, int newX, int newY) {
        System.out.println(String.format("New location of: '%s' is X='%s', Y='%s'", this.getName(), newX, newY));
    }

    public static int getCount() {
        return count;
    }
}
