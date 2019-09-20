package io.github.kwahome.creational.abstractfactory.example.animals;

import io.github.kwahome.creational.abstractfactory.example.animals.enums.AnimalSound;
import io.github.kwahome.creational.abstractfactory.example.animals.enums.AnimalType;

public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return AnimalType.DOG.value();
    }

    @Override
    public void makeSound() {
        System.out.println(this.getAnimal() + ": " + AnimalSound.BARK.value());
    }
}
