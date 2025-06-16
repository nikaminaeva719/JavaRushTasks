package com.javarush.task.sql.task07.task0708;

import java.sql.*;
import java.time.LocalDateTime;

/* 
Получение даты
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select name, created from employee")) {
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                LocalDateTime localDateTime = resultSet.getObject("created", LocalDateTime.class);
                System.out.println(name + " " + localDateTime);
            }
        } catch (SQLException e) {

        }

    }
}
