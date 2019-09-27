package io.github.kwahome.creational.objectpool.example;

public interface ObjectPool<ObjectType> {
    ObjectType create();
    boolean validate(final ObjectType object);
    void destroy(final ObjectType object);
}
