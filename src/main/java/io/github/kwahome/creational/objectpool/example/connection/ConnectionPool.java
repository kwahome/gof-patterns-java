package io.github.kwahome.creational.objectpool.example.connection;

import java.sql.Connection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;

import io.github.kwahome.creational.objectpool.example.ObjectPool;

public abstract class ConnectionPool implements ObjectPool<Connection> {
    private long deadTime;
    private HashMap<Connection, Long> lock = new HashMap<>();
    private HashMap<Connection, Long> unlock = new HashMap<>();

    public synchronized Connection getConnection() {
        long timeNow = System.currentTimeMillis();
        Connection connection;
        if (this.unlock.size() > 0) {
            Enumeration<Connection> objectEnumeration = Collections.enumeration(unlock.keySet());
            while (objectEnumeration.hasMoreElements()) {
                connection = objectEnumeration.nextElement();
                if ((timeNow - this.unlock.get(connection)) > this.deadTime) {
                    // connection is dead
                    this.unlock.remove(connection);
                    this.destroy(connection);
                } else {
                    if (this.validate(connection)) {
                        this.unlock.remove(connection);
                        this.lock.put(connection, timeNow);
                        return connection;
                    } else {
                        // object failed validation
                        this.unlock.remove(connection);
                        this.destroy(connection);
                    }
                }
            }
        }
        // no objects available, create new one
        connection = this.create();
        this.lock.put(connection, timeNow);
        return connection;
    }

    public synchronized void yield(final Connection connection) {
        this.lock.remove(connection);
        this.unlock.put(connection, System.currentTimeMillis());
    }
}
