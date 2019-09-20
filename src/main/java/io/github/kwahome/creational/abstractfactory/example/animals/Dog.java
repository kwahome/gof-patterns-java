package io.github.kwahome.creational.abstractfactory.example.animals;

import io.github.kwahome.creational.abstractfactory.example.animals.enums.AnimalSound;
import io.github.kwahome.creational.abstractfactory.example.animals.enums.AnimalType;

public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return AnimalType.DUCK.value();
    }

    @Override
    public String makeSound() {
        return AnimalSound.BARK.value();
    }
}
