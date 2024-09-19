package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner path = new Scanner(System.in);
        List<String> list = Files.readAllLines(Path.of(path.nextLine()));
        for (String str : list){
            str = str.replaceAll("[\\s ,.]", "");
            System.out.println(str);
        }


    }
}

