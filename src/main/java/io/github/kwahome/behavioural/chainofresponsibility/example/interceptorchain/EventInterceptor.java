package io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain;

public interface EventInterceptor {

    void handle(final AbstractEvent event);
}
