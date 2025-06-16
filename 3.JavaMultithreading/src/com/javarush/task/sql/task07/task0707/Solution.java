package com.javarush.task.sql.task07.task0707;

import java.sql.*;

/* 
Метод wasNull
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select name, weight from employee")) {
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Double weight = resultSet.getDouble("weight");
                if (resultSet.wasNull()) {
                    weight = null;
                }
                System.out.println(name + " " + weight);
            }
        }

    }
}
