package com.javarush.task.sql.task10.task1005;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.javarush.task.sql.task10.task1005.entities.Book;

import java.util.List;

/* 
task1005
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "from Book b where author.fullName = 'Mark Twain' and publisher.name = 'Фолио'";
            Query<Book> bookQuery = session.createQuery(hql, Book.class);
            List<Book> books = bookQuery.getResultList();
            books.forEach(System.out::println);

        }
    }
}