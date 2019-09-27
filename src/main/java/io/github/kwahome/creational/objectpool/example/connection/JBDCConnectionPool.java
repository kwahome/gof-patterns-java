package io.github.kwahome.creational.objectpool.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDCConnectionPool extends ConnectionPool {
    private String dsn;
    private String user;
    private String password;

    public JBDCConnectionPool(final String driver, final String dsn, final String user, final String password) {
        super();
        this.getDriverInstance(driver);
        this.dsn = dsn;
        this.user = user;
        this.password = password;
    }

    @Override
    public Connection create() {
        Connection connection;
        try {
            connection = (DriverManager.getConnection(this.dsn, this.user, this.password));
        } catch (SQLException e) {
            e.printStackTrace();
            connection = null;
        }
        return connection;
    }

    @Override
    public boolean validate(final Connection connection) {
        boolean result = false;
        try {
            result = !connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void destroy(final Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getDriverInstance(final String driver) {
        try {
            Class.forName(driver).getConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
