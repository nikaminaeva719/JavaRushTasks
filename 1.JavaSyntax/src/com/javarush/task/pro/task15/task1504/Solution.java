package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


/*
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePath1 = scanner.nextLine();
        String filePath2 = scanner.nextLine();
        try(InputStream inputStream = Files.newInputStream(Paths.get(filePath1));
        OutputStream outputStream = Files.newOutputStream(Paths.get(filePath2))){
            byte[] bytesIn = inputStream.readAllBytes();
            byte [] bytesOut = new byte[bytesIn.length];
            for (int i = 0; i < bytesIn.length; i+=2) {
                if(i < bytesIn.length -1) {
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                } else {
                    bytesOut[i] = bytesIn[i];
                }
            }
            outputStream.write(bytesOut);
        }


    }
}

