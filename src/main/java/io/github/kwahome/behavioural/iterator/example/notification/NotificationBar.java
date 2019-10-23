package io.github.kwahome.behavioural.iterator.example.notification;

import io.github.kwahome.behavioural.iterator.example.notification.collection.NotificationCollection;
import io.github.kwahome.behavioural.iterator.example.notification.iterator.Iterator;

public class NotificationBar {

    private NotificationCollection notifications;

    public NotificationBar(final NotificationCollection notifications) {
        this.notifications = notifications;
    }

    public void printNotifications() {
        Iterator iterator = notifications.getIterator();
        System.out.println("-------NOTIFICATION BAR------------");
        while (iterator.hasNext()) {
            Notification notification = (Notification) iterator.next();
            System.out.println("Notification: '"+ notification.getNotification() + "'");
        }
    }
}
