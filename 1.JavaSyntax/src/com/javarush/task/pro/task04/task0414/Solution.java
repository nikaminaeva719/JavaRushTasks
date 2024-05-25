package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Введите строку");
       String phrase = keyboard.nextLine();
       System.out.println("Введите число");
       int number = keyboard.nextInt();

       do{

            System.out.println(phrase);
            number--;

       } while ( number > 0  && number < 4);

    }
}