package io.github.kwahome.creational.singleton.example.eagerinitialized;

public class SingletonClass {
    private static final SingletonClass instance = new SingletonClass();

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        return instance;
    }
}
