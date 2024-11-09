package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine());
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        while (reader.ready()) {
            System.out.println(reader.readLine());
        }
        reader.close();
        inputStream.close();
    }
}