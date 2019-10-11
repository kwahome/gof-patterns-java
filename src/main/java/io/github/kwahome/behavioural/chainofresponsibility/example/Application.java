package io.github.kwahome.behavioural.chainofresponsibility.example;

public class Application {
    public static void main(String []args) {

        System.out.println("Message Handler Chain:");
        System.out.println("----------------------");
        String testMessage = "blah! blah! blah!";
        Client.getHandlerChain().handle(testMessage);

        System.out.println("\n");

    }
}
