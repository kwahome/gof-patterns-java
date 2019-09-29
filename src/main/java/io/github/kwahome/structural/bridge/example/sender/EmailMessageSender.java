package io.github.kwahome.structural.bridge.example.sender;

public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage(final String message) {
        System.out.println(String.format("%s: Sending text message: '%s'", this.getClass().getSimpleName(), message));
    }
}
