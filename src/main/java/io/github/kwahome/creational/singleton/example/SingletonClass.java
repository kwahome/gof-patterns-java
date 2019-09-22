package io.github.kwahome.creational.singleton.example;

public class SingletonClass {
    private static SingletonClass instance = null;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
