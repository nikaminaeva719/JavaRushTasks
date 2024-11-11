package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Scanner scanner = new Scanner(new FileInputStream(line));
        List <Integer> list = new ArrayList<>();
        while(scanner.hasNext()){
            int chislo = scanner.nextInt();
            if (chislo % 2 == 0){
                list.add(chislo);
            }
        }
        Collections.sort(list);
        for (Integer value : list){
            System.out.println(value);
        }
        scanner.close();
       
    }
}
