package io.github.kwahome.behavioural.chainofresponsibility.example;

import java.util.Objects;

public abstract class AbstractHandler implements Handler {

    private Handler nextHandler;

    public AbstractHandler(final Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    protected void invokeNextHandler(final String message) {
        if (Objects.nonNull(this.getNextHandler())) {
            System.out.println(this.getClass().getSimpleName() + ": Forwarding message to: " +
                    this.getNextHandler().getClass().getSimpleName());
            System.out.println("\n");
            this.getNextHandler().handle(message);
        } else {
            System.out.println(this.getClass().getSimpleName() + ": Has no chained next handler");
            System.out.println("End of handler chain");
        }
    }
}
