package com.javarush.task.sql.task07.task0702;

import java.sql.*;

/* 
task0702
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select 7 * 8")) {

            System.out.println("Результат:" + resultSet.next());
        } catch (Exception e) {
            System.out.println("Упс..Что-то пошло не так.");
        }


    }
}