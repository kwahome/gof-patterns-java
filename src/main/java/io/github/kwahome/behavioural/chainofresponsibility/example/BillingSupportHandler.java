package io.github.kwahome.behavioural.chainofresponsibility.example;

public class BillingSupportHandler implements Handler {

    public BillingSupportHandler() {
    }

    @Override
    public void handle(final String message) {
        System.out.println(this.getClass().getSimpleName() + ": Processing message: " + message);
    }
}
