package io.github.kwahome.behavioural.chainofresponsibility.example;

public class GeneralSupportHandler implements Handler {

    public GeneralSupportHandler() {
    }

    @Override
    public void handle(final String message) {
        System.out.println(this.getClass().getSimpleName() + ": Processing message: " + message);
    }
}
