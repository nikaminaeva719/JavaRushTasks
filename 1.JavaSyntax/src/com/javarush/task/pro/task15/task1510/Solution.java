package com.javarush.task.pro.task15.task1510;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем байты в файл
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        byte[] bytes = args[0].getBytes();
        Files.write(Path.of(scanner.nextLine()), bytes);
    }
}

