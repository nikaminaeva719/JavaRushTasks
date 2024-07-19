package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/

import java.time.Duration;

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        Double db = Double.parseDouble(string);
        System.out.println(Math.round(db));
    }
}
