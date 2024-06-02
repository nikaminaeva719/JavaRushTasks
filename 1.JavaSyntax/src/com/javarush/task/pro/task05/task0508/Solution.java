package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = keyboard.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(strings[i + 1])) {
                strings[i] = "";
            }

        }

        for (int i = 0; i < strings.length; i++) {

            System.out.print(strings[i] + ", ");
        }
    }
}
