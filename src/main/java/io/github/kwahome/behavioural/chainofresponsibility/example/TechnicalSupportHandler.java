package io.github.kwahome.behavioural.chainofresponsibility.example;

public class TechnicalSupportHandler extends AbstractHandler {

    public TechnicalSupportHandler(final Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(final String message) {
        System.out.println(this.getClass().getSimpleName() + ": Processing message: " + message);
        this.invokeNextHandler(message);
    }
}
