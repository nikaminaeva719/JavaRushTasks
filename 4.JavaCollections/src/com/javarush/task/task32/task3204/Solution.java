package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/* 
Генератор паролей
*/

public class Solution {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ByteArrayOutputStream password = getPassword();
            System.out.println(password.toString());
        }

    }

    public static ByteArrayOutputStream getPassword() {
        String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String alphabet = alphabetLower + alphabetUpper + numbers;
        Random random = new Random();
        char[] chars = new char[8];
        for (int i = 0; i < 8; i++) {
            chars[i] = alphabet.charAt(random.nextInt(alphabet.length()));
        }
        String password = new String(chars);
        if (password.matches(".*\\d.*") &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*")) {
            try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
                byteArrayOutputStream.write(password.getBytes());
                return byteArrayOutputStream;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            return getPassword();
        }
    }
}
