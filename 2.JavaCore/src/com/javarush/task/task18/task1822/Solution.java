package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main1(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(console.readLine()))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] lines = line.split(" ");
                if (args[0].equals(lines[0])) {
                    System.out.println(line);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Paths.get(new Scanner(System.in).nextLine()));
        String[] stringsArray = list.stream().map(str -> str.split(" ")).filter(strings -> strings[0].equals(args[0]))
                .findFirst().orElseThrow();
        System.out.println(String.join(" ", stringsArray));
    }
}
