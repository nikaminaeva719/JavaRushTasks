package com.javarush.task.sql.task10.task1010;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
task1010
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getAll().forEach(System.out::println);
    }

    public static List<Employee> getAll() {
        List<Employee> employees;
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String sql = "select * from employee order by id";
            NativeQuery<Employee> nativeQuery = session.createNativeQuery(sql, Employee.class);
            employees = nativeQuery.getResultList();
        }
        return employees;
    }
}