package com.javarush.task.sql.task10.task1001;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1001
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "select distinct smth from Employee  where age > 18 ";
            Query<String> query = session.createQuery(hql, String.class);
            List<String> strings = query.getResultList();

            for (String string : strings) {
                System.out.println(string);
            }
        }

    }
}