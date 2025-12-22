package net.ictcampus.semodul.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    String user, pwd, url;
    public static ConnectionFactory connectionFactory;

    public ConnectionFactory(String url, String user, String pwd) {
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }

    public static ConnectionFactory getInstance() {
        if (connectionFactory == null) {
            connectionFactory = new ConnectionFactory("jdbc:mysql://localhost:3306/casino", "root", "1234");
        }
        return connectionFactory;
    }

    public Connection getConnection() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection(url, user, pwd);
        return connection;
    }
}
