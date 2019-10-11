package io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain.handler;

import io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain.AbstractEvent;
import io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain.EventInterceptor;

public class IdempotencyCheckInterceptor implements EventInterceptor {

    @Override
    public void handle(AbstractEvent event) {
        System.out.println(this.getClass().getSimpleName() + " handling event: " + event.toString());
    }
}
