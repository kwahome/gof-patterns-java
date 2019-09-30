package io.github.kwahome.structural.decorator.example.bouquet.decorator;

import io.github.kwahome.structural.decorator.example.bouquet.FlowerBouquet;

public class PaperWrapper extends FlowerBouquet {

    private FlowerBouquet flowerBouquet;

    public PaperWrapper(final FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return this.flowerBouquet.getDescription() + ", paper wrap";
    }

    @Override
    public double cost() {
        return 3 + this.flowerBouquet.cost();
    }
}
