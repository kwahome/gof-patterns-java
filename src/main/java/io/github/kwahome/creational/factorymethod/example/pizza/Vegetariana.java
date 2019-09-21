package io.github.kwahome.creational.factorymethod.example.pizza;

import java.util.Arrays;

import io.github.kwahome.creational.factorymethod.example.pizza.enums.PizzaType;

public class Vegetariana extends BasePizza {

    @Override
    public void addIngredients() {
        System.out.println("Adding: " + Arrays.toString(this.prepareIngredients()));
    }

    @Override
    public String getType() {
        return PizzaType.VEGETARIANA.name();
    }

    private String[] prepareIngredients() {
        return new String[] {
            "tomato sauce", "mozzarella", "mushrooms", "onion", "artichoke", "sweet corn", "green peppers"};
    }
}
