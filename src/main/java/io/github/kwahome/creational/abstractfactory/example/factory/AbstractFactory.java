package io.github.kwahome.creational.abstractfactory.example.factory;

import java.util.Optional;

public interface AbstractFactory<T> {
    Optional<T> create(final String type);
}
