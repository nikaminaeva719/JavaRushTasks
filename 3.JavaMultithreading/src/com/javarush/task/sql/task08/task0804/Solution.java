package com.javarush.task.sql.task08.task0804;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/* 
task0804
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            for (int i = 0; i < 5; i++) {
                preparedStatement.setString(1, "employee_" + i);
                preparedStatement.setInt(2, 30 + i);
                preparedStatement.setString(3, "i = " + i);
                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так.");
        }

    }
}
