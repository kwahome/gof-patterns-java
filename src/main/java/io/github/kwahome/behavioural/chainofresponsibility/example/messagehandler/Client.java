package io.github.kwahome.behavioural.chainofresponsibility.example.messagehandler;

public class Client {

    public static Handler getHandlerChain() {
        Handler generalSupportHandler = new GeneralSupportHandler(null);
        Handler billingSupportHandler = new BillingSupportHandler(generalSupportHandler);
        return new TechnicalSupportHandler(billingSupportHandler);
    }
}
