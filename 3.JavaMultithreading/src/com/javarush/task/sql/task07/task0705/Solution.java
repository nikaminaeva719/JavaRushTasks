package com.javarush.task.sql.task07.task0705;

import java.sql.*;

/* 
task0705
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select min(distinct age) from employee")) {
            while (resultSet.next()) {
                System.out.println("Минимальное значение колонки age — " + resultSet.getInt(1));

            }
        } catch (SQLException e) {
            System.out.println("Что-то пошло не так.");
        }

    }
}
