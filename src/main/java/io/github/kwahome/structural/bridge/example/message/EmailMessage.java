package io.github.kwahome.structural.bridge.example.message;

import io.github.kwahome.structural.bridge.example.sender.MessageSender;

public class EmailMessage extends AbstractMessage {

    public EmailMessage(final String message, final MessageSender messageSender) {
        this.message = message;
        this.messageSender = messageSender;
    }

    @Override
    public void send() {
        this.messageSender.sendMessage(this.message);
    }
}
