package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 5 -> System.out.printf("");
            case 10 -> System.out.println();
            case 25 -> System.out.println();
            case 100 -> System.out.println();
            default -> System.out.println();
        }
        ;
    }
}
