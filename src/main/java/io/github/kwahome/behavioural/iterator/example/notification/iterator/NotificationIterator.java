package io.github.kwahome.behavioural.iterator.example.notification.iterator;

import io.github.kwahome.behavioural.iterator.example.notification.Notification;

public class NotificationIterator implements Iterator {

    private Notification[] notificationList;

    // maintains current position of iterator over the array
    private int position = 0;

    public  NotificationIterator (final Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        return this.position < notificationList.length && notificationList[this.position] != null;
    }

    @Override
    public Object next() {
        // return next element in the array and increment pos
        Notification notification =  notificationList[this.position];
        this.position += 1;
        return notification;
    }
}
