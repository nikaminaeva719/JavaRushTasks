package com.javarush.task.sql.task07.task0701;

import java.sql.*;

/* 
task0701
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Подключение установлено.");
        } catch (Exception e) {
            System.out.println("Ошибка подключения.");
        }


    }
}
