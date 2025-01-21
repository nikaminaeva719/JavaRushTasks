package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
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

            if (args.length > 0 && args[0].equals("-u") && args.length >= 5) {
                String id = stringFormat(args[1], 8);
                String productName = args[2];
                String price = args[3];
                String quantity = args[4];

                String updatedLine = id +
                        stringFormat(productName, 30) +
                        stringFormat(price, 8) +
                        stringFormat(quantity, 4);

                // Обновляем строку в списке
                boolean updated = false;
                for (int i = 0; i < fileLines.size(); i++) {
                    if (fileLines.get(i).startsWith(id)) {
                        fileLines.set(i, updatedLine);
                        updated = true;
                        break;
                    }
                }

            } else if (args.length > 0 && args[0].equals("-d") && args.length >= 2) {
                String id = stringFormat(args[1], 8);
                fileLines.removeIf(line -> line.startsWith(id));
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
