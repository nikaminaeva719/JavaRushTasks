package com.javarush.task.pro.task13.task1310;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.DoubleStream;

/* 
Успеваемость студентов-2
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        Set<String> strings = grades.keySet();
        for (String string : strings) {
            System.out.println(string);
        }

    }

    public static Double getAverageMark() {
        Collection<Double> values = grades.values();
        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        return  sum/values.size();
//        return grades.values().stream()
//                .mapToDouble(Double::valueOf)
//                .average()
//                .orElseThrow();
    }
}
