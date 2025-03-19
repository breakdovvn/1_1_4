package jm.task.core.jdbc.util;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Util {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/main";
        String user = "root";
        String password = "1234";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Соединение с БД успешно установлено!");
            }
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Не удалось установить соединение с БД!");
        }
        return null;
    }
}
