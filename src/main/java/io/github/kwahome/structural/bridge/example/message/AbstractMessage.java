package io.github.kwahome.structural.bridge.example.message;

import io.github.kwahome.structural.bridge.example.sender.MessageSender;

public abstract class AbstractMessage implements Message {
    protected String message;
    protected MessageSender messageSender;
}
