package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            while (fileInputStream.available() > 0) {
                int aByte = fileInputStream.read();
                if (!map.containsKey(aByte)) {
                    map.put(aByte, 1);
                } else {
                    int value = map.get(aByte);
                    map.put(aByte, value + 1);
                }
            }
           int max =  Collections.max(map.values());
            for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
                 if (entry.getValue().equals(max)){
                     System.out.print(entry.getKey() + " ");
                 }
            }
        }
    }
}
