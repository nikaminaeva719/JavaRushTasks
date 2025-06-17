package com.javarush.task.sql.task08.task0802;

import java.sql.*;

/* 
Откат транзакции
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        try (connection;
             Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            statement.executeUpdate("update employee set salary = salary + 2000 where name = 'Diego'");
            statement.executeUpdate("update employee set salary = salary + 500 where name = 'Amigo'");
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }

    }
}
