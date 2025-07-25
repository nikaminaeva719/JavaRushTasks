package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите полный путь, куда сохранить архив: ");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(console.readLine()));
        System.out.println("Введите путь до папки файла, который нужно сохранить в архив: ");
        zipFileManager.createZip(Paths.get(console.readLine()));

    }
}
