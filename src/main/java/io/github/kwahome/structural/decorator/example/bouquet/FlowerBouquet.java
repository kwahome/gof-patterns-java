package io.github.kwahome.structural.decorator.example.bouquet;

public abstract class FlowerBouquet implements Bouquet {

    protected String description;
    protected double cost;

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return this.cost;
    }
}
