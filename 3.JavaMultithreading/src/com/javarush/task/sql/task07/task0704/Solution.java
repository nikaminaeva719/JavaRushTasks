package com.javarush.task.sql.task07.task0704;

import java.sql.*;

/* 
task0704
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from employee")) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }

        } catch (Exception e) {

        }

    }
}
