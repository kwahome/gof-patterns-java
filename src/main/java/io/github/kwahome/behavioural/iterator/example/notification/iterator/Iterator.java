package io.github.kwahome.behavioural.iterator.example.notification.iterator;

public interface Iterator {

    // indicates whether there are more elements to
    // iterate over
    boolean hasNext();

    // returns the next element
    Object next();
}