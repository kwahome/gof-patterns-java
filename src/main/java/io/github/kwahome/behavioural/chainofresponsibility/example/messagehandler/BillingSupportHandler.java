package io.github.kwahome.behavioural.chainofresponsibility.example.messagehandler;

public class BillingSupportHandler extends AbstractHandler {

    public BillingSupportHandler(final Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(final String message) {
        System.out.println(this.getClass().getSimpleName() + ": Processing message: " + message);
        this.invokeNextHandler(message);
    }
}
