package io.github.kwahome.creational.factorymethod.example.pizza;

import java.util.Optional;

import io.github.kwahome.creational.factorymethod.example.pizza.enums.PizzaType;

public class PizzaFactory {

    public static Optional<Pizza> createPizza(final PizzaType pizzaType) {
        Optional<Pizza> pizzaOptional;
        switch (pizzaType) {
            case CAPRICCIOSA:
                pizzaOptional = Optional.of(new Capricciosa());
                break;
            case FORMAGGI:
                pizzaOptional = Optional.of(new Formaggi());
                break;
            case MARGHERITA:
                pizzaOptional = Optional.of(new Margherita());
                break;
            case STROMBOLI:
                pizzaOptional = Optional.of(new Stromboli());
                break;
            case VEGETARIANA:
                pizzaOptional = Optional.of(new Vegetariana());
                break;
            default:
                pizzaOptional = Optional.empty();
        }
        return pizzaOptional;
    }
}
