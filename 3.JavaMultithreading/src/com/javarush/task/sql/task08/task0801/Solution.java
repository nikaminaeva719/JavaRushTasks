package com.javarush.task.sql.task08.task0801;

import java.sql.*;

/* 
Работа с транзакциями
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            statement.executeUpdate("update employee set salary = salary + 2000 where name = 'Diego'");
            statement.executeUpdate("update employee set salary = salary + 500 where name = 'Amigo'");
            connection.commit();

        } catch (Exception e) {
            System.out.println("Что-то пошло не так.");
        }


    }
}
