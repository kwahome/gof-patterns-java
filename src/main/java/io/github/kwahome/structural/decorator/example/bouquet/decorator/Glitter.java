package io.github.kwahome.structural.decorator.example.bouquet.decorator;

import io.github.kwahome.structural.decorator.example.bouquet.FlowerBouquet;

public class Glitter extends FlowerBouquet {

    private FlowerBouquet flowerBouquet;

    public Glitter(final FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return this.flowerBouquet.getDescription() + ", glitter";
    }

    @Override
    public double cost() {
        return 4 + this.flowerBouquet.cost();
    }
}
