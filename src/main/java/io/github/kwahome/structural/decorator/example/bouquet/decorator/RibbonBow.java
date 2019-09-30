package io.github.kwahome.structural.decorator.example.bouquet.decorator;

import io.github.kwahome.structural.decorator.example.bouquet.FlowerBouquet;

public class RibbonBow extends FlowerBouquet {
    private FlowerBouquet flowerBouquet;

    public RibbonBow(final FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return this.flowerBouquet.getDescription() + ", ribbon bow";
    }

    @Override
    public double cost() {
        return 6.5 + this.flowerBouquet.cost();
    }
}
