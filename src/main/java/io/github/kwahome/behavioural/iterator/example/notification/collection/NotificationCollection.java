package io.github.kwahome.behavioural.iterator.example.notification.collection;

import io.github.kwahome.behavioural.iterator.example.notification.Notification;
import io.github.kwahome.behavioural.iterator.example.notification.iterator.Iterator;
import io.github.kwahome.behavioural.iterator.example.notification.iterator.NotificationIterator;

public class NotificationCollection implements Collection {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private Notification[] notificationList;

    public NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];

        // Let us add some dummy notifications
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(final String item) {
        Notification notification = new Notification(item);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println(this.getClass().getSimpleName() + " is full");
        } else {
            notificationList[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator getIterator() {
        return new NotificationIterator(notificationList);
    }
}
