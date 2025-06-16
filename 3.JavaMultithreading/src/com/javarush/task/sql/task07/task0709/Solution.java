package com.javarush.task.sql.task07.task0709;

import java.sql.*;

/* 
Метод getObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select name, weight, birthday, inn from employee")) {
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                float weight = resultSet.getFloat("weight");
                Date date = resultSet.getDate("birthday");
                long inn = resultSet.getLong("inn");
                System.out.println(name + " " + weight + " " + date + " " + inn);
            }
        } catch (SQLException e) {

        }

    }
}
