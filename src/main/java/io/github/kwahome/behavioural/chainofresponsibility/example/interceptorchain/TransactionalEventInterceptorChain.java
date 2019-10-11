package io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain;

import java.util.ArrayList;
import java.util.List;

import io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain.handler.CommitUnitOfWorkInterceptor;
import io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain.handler.IdempotencyCheckInterceptor;
import io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain.handler.InitializeUnitOfWorkInterceptor;
import io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain.handler.ValidateEventInterceptor;

public class TransactionalEventInterceptorChain {

    private static List<EventInterceptor> eventInterceptors;

    /**
     * Constructor that initializes interceptors
     */
    public TransactionalEventInterceptorChain() {
        eventInterceptors = new ArrayList<>();

        // you can use dependency injection here
        EventInterceptor initializeUnitOfWorkInterceptor = new InitializeUnitOfWorkInterceptor();
        EventInterceptor validateEventInterceptor = new ValidateEventInterceptor();
        EventInterceptor idempotencyCheckInterceptor = new IdempotencyCheckInterceptor();
        EventInterceptor commitUnitOfWorkInterceptor = new CommitUnitOfWorkInterceptor();

        // add event interceptors in the desired order
        // in this case a transactional chain is desired hence the first interceptor initializes the transaction
        // while the last commits it
        eventInterceptors.add(initializeUnitOfWorkInterceptor);
        eventInterceptors.add(validateEventInterceptor);
        eventInterceptors.add(idempotencyCheckInterceptor);
        eventInterceptors.add(commitUnitOfWorkInterceptor);
    }

    public void handleEvent(final AbstractEvent event) {
        for (EventInterceptor eventInterceptor: eventInterceptors) {
            System.out.println("Invoking interceptor: " + eventInterceptor.getClass().getSimpleName());
            System.out.println("...");
            eventInterceptor.handle(event);
            System.out.println("\n");
        }
    }
}
