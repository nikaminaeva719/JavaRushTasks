package com.javarush.task.pro.task05.task0506;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner keyboard =  new Scanner(System.in);
        int n = keyboard.nextInt();
        array = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            array [i] = keyboard.nextInt();
            while (array[i] < min){
                min = array[i];
            }

        } System.out.println(min);


    }
}
