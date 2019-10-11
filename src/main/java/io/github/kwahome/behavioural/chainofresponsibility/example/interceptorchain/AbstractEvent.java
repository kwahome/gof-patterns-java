package io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain;

public abstract class AbstractEvent {
    private String id;

    public AbstractEvent() {
    }

    public String getId() {
        return id;
    }
}
