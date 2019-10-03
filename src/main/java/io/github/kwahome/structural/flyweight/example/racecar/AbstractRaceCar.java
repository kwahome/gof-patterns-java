package io.github.kwahome.structural.flyweight.example.racecar;

public abstract class AbstractRaceCar implements RaceCar {
    /* Intrinsic state stored and shared in the Flyweight object */
    protected String name;
    protected int speed;
    protected int horsePower;

    public AbstractRaceCar(final String name, final int speed, final int horsePower) {
        this.name = name;
        this.speed = speed;
        this.horsePower = horsePower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
