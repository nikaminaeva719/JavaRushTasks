package com.javarush.task.task17.task1711;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        if (args == null || args.length < 1) {
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        Person person = null;
                        String name = args[i];
                        String sex = args[i + 1];
                        String bd = args[i + 2];
                        if (sex.equalsIgnoreCase("м")) {
                            person = Person.createMale(name, dateFormat.parse(bd));
                        } else if (sex.equalsIgnoreCase("ж")) {
                            person = Person.createFemale(name, dateFormat.parse(bd));
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                }
                break;
            }
            case "-u": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        int index = Integer.parseInt(args[i]);
                        if (index >= 0 && index < allPeople.size()) {
                            Person person = allPeople.get(index);
                            person.setName(args[i + 1]);
                            if (args[i + 2].equalsIgnoreCase("м")) {
                                person.setSex(Sex.MALE);
                            } else if (args[i + 2].equalsIgnoreCase("ж")) {
                                person.setSex(Sex.FEMALE);
                            }
                            person.setBirthDate(dateFormat.parse(args[i + 3]));
                        }
                    }
                }
                break;
            }
            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        if (index >= 0 && index < allPeople.size()) {
                            Person person = allPeople.get(index);
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                }
                break;
            }
            case "-i": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        if (index >= 0 && index < allPeople.size()) {
                            Person person = allPeople.get(index);
                            String name = person.getName();
                            String sex = "";
                            if (person.getSex().equals(Sex.MALE)) {
                                sex = "м";
                            } else if (person.getSex().equals(Sex.FEMALE)) {
                                sex = "ж";
                            }
                            String date = dateFormat1.format(person.getBirthDate());
                            System.out.println(name + " " + sex + " " + date);
                        }
                    }
                }
                break;
            }
        }
    }
}
