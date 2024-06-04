package com.javarush.task.pro.task05.task0505;

import java.util.Arrays;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        if (number > 0){
            int [] arrays = new int[number];
            for (int i = 0; i <number ; i++) {
                arrays [i] = keyboard.nextInt();
            }
            if ( number % 2 != 0){
                for (int i = 0; i < number; i++) {
                    System.out.println(arrays[i]);
                }

            }  else {
                for (int i = arrays.length-1; i >= 0; i--) {
                    System.out.println(arrays[i]);
                }
            }

        }
    }
}
