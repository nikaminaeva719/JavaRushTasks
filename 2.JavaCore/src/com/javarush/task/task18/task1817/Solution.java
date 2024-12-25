package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {

            StringBuilder builder = new StringBuilder();
            while (reader.ready()) {
                String line = reader.readLine();
                builder.append(line);
            }

            int countSpace = 0;
            int length = builder.length();
            char[] chars = builder.toString().toCharArray();

            for (char aChar : chars) {
                if (Character.isSpaceChar(aChar)) {
                    countSpace++;
                }
            }
            if (length != 0) {
                System.out.printf("%.2f", countSpace / length * 100.0);
            }
        }

    }
//        List<String> strings = Files.readAllLines(Paths.get(args[0]));
//        String str = String.join(System.lineSeparator(), strings);
//        char [] chars = str.toCharArray();
//        for ()
//        Character.isSpaceChar(chars)
}
}
