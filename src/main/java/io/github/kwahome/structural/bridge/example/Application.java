package io.github.kwahome.structural.bridge.example;

import io.github.kwahome.structural.bridge.example.message.EmailMessage;
import io.github.kwahome.structural.bridge.example.message.Message;
import io.github.kwahome.structural.bridge.example.message.TextMessage;
import io.github.kwahome.structural.bridge.example.sender.EmailMessageSender;
import io.github.kwahome.structural.bridge.example.sender.TextMessageSender;

public class Application {
    public static void main(String []args) {
        System.out.println("Send Text Message:");
        System.out.println("------------------");
        String textMessage = "Patience you must have my young Padawan";
        sendTextMessage(textMessage);
        System.out.println("\n");

        System.out.println("Send Email Message:");
        System.out.println("-------------------");
        String emailMessage = "Patience you must have my young Padawan";
        sendEmailMessage(emailMessage);
        System.out.println("\n");
    }

    private static void sendTextMessage(final String message) {
        Message textMessage = new TextMessage(message, new TextMessageSender());
        textMessage.send();
    }

    private static void sendEmailMessage(final String message) {
        Message emailMessage = new EmailMessage(message, new EmailMessageSender());
        emailMessage.send();

    }
}
