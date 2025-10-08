package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        ConsoleHelper.writeMessage("Введите полный путь, куда сохранить архив: ");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(console.readLine()));
        ConsoleHelper.writeMessage("Введите путь до папки файла, который нужно сохранить в архив: ");
        zipFileManager.createZip(Paths.get(console.readLine()));

        ExitCommand exitCommand =  new ExitCommand();
        exitCommand.execute();

    }


}
