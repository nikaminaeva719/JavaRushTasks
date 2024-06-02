package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {

        String BB = "ББББББББББББББББББББ";
        String B_B = "Б                  Б";
        int x = 2; // количество сплошных строк
        int y = 8; // количество вертикальныз строк
        while (x!=0) {
            System.out.println(BB);

            while (y!=0) {
                System.out.println(B_B);
                y--;
            }

            x--;
        }

    }
}