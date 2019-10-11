package io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain.handler;

import io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain.AbstractEvent;
import io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain.EventInterceptor;

public class InitializeUnitOfWorkInterceptor implements EventInterceptor {

    @Override
    public void handle(final AbstractEvent event) {
        System.out.println(this.getClass().getSimpleName() + " handling event: " + event.toString());
    }
}
