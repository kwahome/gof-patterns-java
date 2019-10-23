package io.github.kwahome.behavioural.iterator.example.notification;

import io.github.kwahome.behavioural.iterator.example.notification.collection.NotificationCollection;

public class Application {
    public static void main(String []args) {

        System.out.println("Iterator Pattern:");
        System.out.println("-----------------");
        System.out.println("\n");

        NotificationCollection notificationCollection = new NotificationCollection();
        notificationCollection.addItem("Test notification");
        NotificationBar notificationBar = new NotificationBar(notificationCollection);
        notificationBar.printNotifications();

        System.out.println("\n");
    }
}
