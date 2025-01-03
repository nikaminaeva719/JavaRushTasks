package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.equalsIgnoreCase("helicopter")) {
            result = new Helicopter();
        } else if (line.equalsIgnoreCase("plane")) {
            int chislo = scanner.nextInt();
            result = new Plane(chislo);
        }
        scanner.close();
    }
}
