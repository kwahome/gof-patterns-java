package io.github.kwahome.creational.objectpool.example;

import java.sql.Connection;

import io.github.kwahome.creational.objectpool.example.connection.JBDCConnectionPool;

public class Application {
    public static void main(String []args) {
        System.out.println("Object Pool:");
        System.out.println("------------");

        String driver = "org.hsqldb.jdbcDriver";
        String dsn = "jdbc:hsqldb://localhost/mydb";
        String user = "sa";
        String password = "password";
        JBDCConnectionPool connectionPool = new JBDCConnectionPool(driver, dsn, user, password);

        // get connection
        Connection connection = connectionPool.getConnection();
        System.out.println("Acquired connection: " + connection);
        // return connection
        connectionPool.release(connection);
        System.out.println("\n");
    }
}
