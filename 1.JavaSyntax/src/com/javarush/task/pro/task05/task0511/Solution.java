package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        multiArray = new int[number][];
        for (int i = 0; i < multiArray.length; i++) {
            int number2 = keyboard.nextInt();
            multiArray [i] = new int[number2];

        }
    }
}
