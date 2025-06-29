package com.javarush.task.jdk13.task34.task3402;

/* 
Факториал с помощью рекурсии
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        System.out.println(solution.factorial(9));     //362880
//        System.out.println(solution.factorial(0));     //1
//        System.out.println(solution.factorial(1));     //1
        System.out.println(solution.factorial(3));
    }

    public int factorial(int n) {
        if (n <= 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
