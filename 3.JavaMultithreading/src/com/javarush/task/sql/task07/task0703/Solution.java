package com.javarush.task.sql.task07.task0703;

import java.sql.*;

/* 
task0703
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from employee")) {

            System.out.println("Запрос успешно выполнен." + resultSet.next());
        } catch (Exception e) {
            System.out.println("Что-то пошло не так.");
        }


    }
}
