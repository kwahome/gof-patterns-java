package io.github.kwahome.creational.factorymethod.example;

import java.util.ArrayList;

import io.github.kwahome.creational.factorymethod.example.car.Car;
import io.github.kwahome.creational.factorymethod.example.car.CarFactory;
import io.github.kwahome.creational.factorymethod.example.car.enums.CarType;
import io.github.kwahome.creational.factorymethod.example.pizza.Pizza;
import io.github.kwahome.creational.factorymethod.example.pizza.PizzaFactory;
import io.github.kwahome.creational.factorymethod.example.pizza.enums.PizzaType;

public class Application {
    public static void main(String []args) {
        System.out.println("Car Factory:");
        System.out.println("------------");
        assembleCars();
        System.out.println("\n");

        System.out.println("Pizza Factory:");
        System.out.println("--------------");
        makePizzas();
        System.out.println("\n");
    }

    private static void assembleCars() {
        ArrayList<CarType> carTypes = new ArrayList<>();
        carTypes.add(CarType.COUPE);
        carTypes.add(CarType.HATCHBACK);
        carTypes.add(CarType.SEDAN);
        carTypes.add(CarType.VAN);

        for (CarType carType: carTypes) {
            CarFactory.buildCar(carType).ifPresentOrElse(
                Car::assemble, () -> System.out.println("Car of type: '" + carType + "' does not exist"));
        }
    }

    private static void makePizzas() {
        ArrayList<PizzaType> pizzaTypes = new ArrayList<>();
        pizzaTypes.add(PizzaType.CAPRICCIOSA);
        pizzaTypes.add(PizzaType.FORMAGGI);
        pizzaTypes.add(PizzaType.MARGHERITA);
        pizzaTypes.add(PizzaType.STROMBOLI);
        pizzaTypes.add(PizzaType.VEGETARIANA);

        for (PizzaType pizzaType: pizzaTypes) {
            PizzaFactory.createPizza(pizzaType).ifPresentOrElse(pizza -> {pizza.makePizza(); System.out.println("\n");},
                () -> System.out.println("Pizza of type: '" + pizzaType + "' does not exist"));
        }
    }
}
