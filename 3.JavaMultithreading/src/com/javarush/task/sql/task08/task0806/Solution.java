package com.javarush.task.sql.task08.task0806;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

/* 
task0806
*/

public class Solution {

    public static Set<Employee> employees = new HashSet<>();

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "root");
             PreparedStatement preparedStatement = connection.prepareStatement("select id,name, age, smth from employee");
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String smth = resultSet.getString("smth");
                Employee employee = new Employee(id, name, age, smth);
                employees.add(employee);
            }
        }
        employees.forEach(System.out::println);
    }
}
