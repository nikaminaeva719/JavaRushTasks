package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {


    public static void main(String[] args)  {
        int number = 32;
        int flagPos = 0;

        setFlag(number, flagPos);
        resetFlag(number, flagPos);
        checkFlag(number, flagPos);
    }

    public static int setFlag(int number, int flagPos) {
        int a = number | (1 << flagPos);
        return a;
    }

    public static int resetFlag(int number, int flagPos) {
        int b = number & ~(1 << flagPos);
        return b;
    }

    public static boolean checkFlag(int number, int flagPos) {
      return   (number & (1 << flagPos)) == (1 << flagPos);


    }
}
