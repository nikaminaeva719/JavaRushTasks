package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
//    public static void main1(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        for (int i = Math.min(a, b); i > 1; i--) {
//            if (a % i == 0 && b % i == 0) {
//                System.out.println(i);
//                break;
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger integer1 = new BigInteger(scanner.nextLine());
        BigInteger integer2 = new BigInteger(scanner.nextLine());
        System.out.println(integer1.gcd(integer2));

    }
}
