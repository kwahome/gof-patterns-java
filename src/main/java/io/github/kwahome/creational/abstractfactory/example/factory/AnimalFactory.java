package io.github.kwahome.creational.abstractfactory.example.factory;

import java.util.Optional;

import io.github.kwahome.creational.abstractfactory.example.animals.Animal;
import io.github.kwahome.creational.abstractfactory.example.animals.Dog;
import io.github.kwahome.creational.abstractfactory.example.animals.Duck;
import io.github.kwahome.creational.abstractfactory.example.animals.enums.AnimalType;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Optional<Animal> create(final String animalType) {
        if (animalType.equals(AnimalType.DOG.value())) {
            return Optional.of(new Dog());
        }

        if (animalType.equals(AnimalType.DUCK.value())) {
            return Optional.of(new Duck());
        }

        return Optional.empty();
    }
}
