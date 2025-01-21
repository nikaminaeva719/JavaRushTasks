package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Считаем зарплаты
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Files.readAllLines(Paths.get(args[0])).stream()
                .collect(Collectors.toMap(
                        string -> string.split(" ") [0],
                        string -> Double.parseDouble(string.split(" ")[1]),
                                Double::sum,
                                TreeMap::new)
                        )
                .forEach(((key, value) -> System.out.println(key + " " + value)));
    }

    public static void main1(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Double> map = new TreeMap<>();

            while (bufferedReader.ready()) {
                String content = bufferedReader.readLine();
                String[] strings = content.split(" ");
                String name = strings[0];
                double value = Double.parseDouble(strings[1]);
                if (map.containsKey(name)) {
                    map.put(name, map.get(name) + value);
                } else {
                    map.put(name, value);
                }
            }

            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        }
    }
}
