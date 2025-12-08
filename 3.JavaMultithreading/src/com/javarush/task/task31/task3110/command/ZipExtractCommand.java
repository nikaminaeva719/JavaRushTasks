package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipExtractCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Распаковка архива.");
            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Введите полное имя файла или директории для распаковки:");
            Path source = Paths.get(ConsoleHelper.readString());
            zipFileManager.extractAll(source);

            ConsoleHelper.writeMessage("Архив распакован.");
        } catch (Exception e) {
            ConsoleHelper.writeMessage("Архив не существует");
        }
    }
}
