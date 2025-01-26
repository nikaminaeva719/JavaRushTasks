package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main1(String[] args) throws IOException, ParseException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {

            while (reader.ready()) {

                String line = reader.readLine();
                String[] strings = line.split(" ");
                String[] array = Arrays.copyOfRange(strings, 0, strings.length - 3);
                String name = String.join(" ", array);
                String stringDate = String.join(" ", Arrays.copyOfRange(strings, strings.length - 3, strings.length));
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                Date birthDate = dateFormat.parse(stringDate);
                Person person = new Person(name, birthDate);
                PEOPLE.add(person);

            }

            for (Person person : PEOPLE) {
                System.out.println(person.getName() + " " + person.getBirthDate());
            }
        }

    }

    public static void main2(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            while (reader.ready()){
                String line = reader.readLine();
                String name = line.replaceAll("\\d","").trim();
                String date = line.replaceAll("\\D"," ").trim();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                Date birthDate = dateFormat.parse(date);
                Person person = new Person(name,birthDate);
                PEOPLE.add(person);

            }
            for (Person person : PEOPLE) {
                System.out.println(person.getName() + " " + person.getBirthDate());
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Files.readAllLines(Paths.get(args[0]))
                .stream()
                .map(string ->
                        new Person(
                                string.replaceAll("\\d", "").trim(),
                                Date.from(
                                        LocalDate.parse(string.replaceAll("\\D"," ").trim(), DateTimeFormatter.ofPattern("dd M yyyy"))
                                                .atStartOfDay(ZoneId.systemDefault())
                                                .toInstant()
                                )
                        )
                )
                .peek(PEOPLE::add)
                .forEach(System.out::println);
    }
}
