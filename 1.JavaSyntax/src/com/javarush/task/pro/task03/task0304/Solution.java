package com.javarush.task.pro.task03.task0304;

import java.util.Scanner;

/* 
Измерим температуру тела
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            int starCount = 10 - i;
            for (int j = 2; j < starCount; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
