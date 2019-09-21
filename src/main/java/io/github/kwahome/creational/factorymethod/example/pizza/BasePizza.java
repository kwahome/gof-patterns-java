package io.github.kwahome.creational.factorymethod.example.pizza;

public abstract class BasePizza implements Pizza {

    @Override
    public void makePizza() {
        System.out.println(String.format("Preparing %s pizza", this.getType()));
        this.addIngredients();
        System.out.println("Pizza baking at 400 degrees Celcius for 20 minutes.");
    }
}
