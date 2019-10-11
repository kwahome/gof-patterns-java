package io.github.kwahome.behavioural.chainofresponsibility.example;

import java.util.Objects;

public class GeneralSupportHandler extends AbstractHandler {

    public GeneralSupportHandler(final Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(final String message) {
        System.out.println(this.getClass().getSimpleName() + ": Processing message: " + message);
        this.forwardToNextHandler(message);
    }
}
