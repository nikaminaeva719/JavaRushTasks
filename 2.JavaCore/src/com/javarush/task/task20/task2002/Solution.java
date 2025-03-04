package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            User newUser = new User();
            newUser.setFirstName("Иван");
            newUser.setLastName("Иванов");
            newUser.setBirthDate(new Date(2025, Calendar.APRIL, 10));
            newUser.setMale(true);
            newUser.setCountry(User.Country.RUSSIA);

            javaRush.users.add(newUser);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            System.out.println(loadedObject.equals(javaRush));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {

            try (PrintStream stream = new PrintStream(outputStream)) {
                if (!users.isEmpty()) {
                    for (User user : users) {
                        String string = user.getFirstName() + " "
                                + user.getLastName() + " "
                                + user.getBirthDate().getTime() + " "
                                + user.isMale() + " "
                                + user.getCountry().getDisplayName();
                        stream.println(string);
                    }
                }
            }

        }

        public void load(InputStream inputStream) throws Exception {

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                while (reader.ready()) {
                    User user = new User();
                    String line = reader.readLine();
                    String[] lines = line.split(" ");
                    if (lines.length < 5) {
                        break;
                    }
                    user.setFirstName(lines[0]);
                    user.setLastName(lines[1]);
                    user.setBirthDate(new Date(Long.parseLong(lines[2])));
                    user.setMale(Boolean.parseBoolean(lines[3]));
                    user.setCountry(User.Country.valueOf(lines[4].toUpperCase()));
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
