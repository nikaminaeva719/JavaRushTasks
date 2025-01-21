package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = console.readLine();

            List<String> fileLines = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                while (reader.ready()) {
                    fileLines.add(reader.readLine());
                }
            }

            if (args[0].equals("-c") && args.length >= 4){
                String productName = args[1];
                String price = args[2];
                String quantity = args[3];
                int maxId = 0;
                for (String lines : fileLines) {
                    int currentId = Integer.parseInt(lines.substring(0,8).trim());
                    maxId = Math.max(maxId,currentId);
                }
                String newId = stringFormat(String.valueOf(maxId + 1),8);
                String newLine = newId
                        + stringFormat(productName,30)
                        + stringFormat(price,8)
                        + stringFormat(quantity,4);
                fileLines.add(newLine);

            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (String line : fileLines) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        }
    }

    public static String stringFormat(String str, int length) {
        if (str.length() > length) {
            return str.substring(0, length);
        } else {
            StringBuilder builder = new StringBuilder(str);
            while (builder.length() < length) {
                builder.append(" ");
            }
            return builder.toString();
        }
    }
}
