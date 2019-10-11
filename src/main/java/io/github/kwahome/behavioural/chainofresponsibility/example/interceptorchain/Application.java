package io.github.kwahome.behavioural.chainofresponsibility.example.interceptorchain;

public class Application {
    public static void main(String []args) {

        System.out.println("Event Interceptor Chain:");
        System.out.println("------------------------");
        AbstractEvent event = new AbstractEvent() {};

        new TransactionalEventInterceptorChain().handleEvent(event);

        System.out.println("\n");

    }
}
