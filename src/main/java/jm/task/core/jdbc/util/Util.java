package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String url = "jdbc:mysql://localhost:3306/db";
    public static final String login = "root";
    public static final String pass = "root";

    //public static void main(String[] args) {
    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        //Statement statement = null;

        try {
            connection = DriverManager.getConnection(url, login, pass);
            //statement = connection.createStatement();
            System.out.println("Connect");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
