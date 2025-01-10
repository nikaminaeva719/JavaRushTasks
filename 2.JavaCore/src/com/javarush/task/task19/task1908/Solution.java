package com.javarush.task.task19.task1908;


import java.io.*;
import java.nio.file.Paths;

/* 
Выделяем числа
*/

public class Solution {
    public static void main1(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))) {
            while (reader.ready()) {
                String line = reader.readLine();

                String[] strings = line.split(" ");

                for (String string : strings) {
                    try {
                        int num = Integer.parseInt(string);
                        writer.write(num + " ");

                    } catch (Exception e) {

                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String string = line.replaceAll("([a-zA-Zа-яА-ЯёЁ]+\\d*|\\d+[a-zA-Zа-яА-ЯёЁ])\\s*", "");
                writer.write(string);
            }
        }
    }
}


