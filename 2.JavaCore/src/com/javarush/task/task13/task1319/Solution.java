package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dst = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(dst));
        StringBuilder builder = new StringBuilder();
        String s = "";
        while (!s.equals("exit")) {
            s = reader.readLine();
            builder.append(s).append("\n");
        }
        writer.write(builder.toString());
        writer.close();
    }
}
