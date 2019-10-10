package io.github.kwahome.behavioural.chainofresponsibility.example;

public class TechnicalSupportHandler implements Handler {

    public TechnicalSupportHandler() {
    }

    @Override
    public void handle(final String message) {
        System.out.println(this.getClass().getSimpleName() + ": Processing message: " + message);
    }
}
