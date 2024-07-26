package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        String check1 = "https";
        String check2 = "http";
        if (url.startsWith(check1)){
            return check1;
        } else if (url.startsWith(check2)) {
            return check2;
        }
        return "неизвестный";
    }

    public static String checkDomain(String url) {
        String check3 = "com";
        String check4 = "net";
        String check5= "org";
        String check6 = "ru";
        if (url.endsWith(check3)){
            return check3;
        } else if (url.endsWith(check4)) {
            return check4;
        }else if (url.endsWith(check5)) {
            return check5;
        } else if (url.endsWith(check6)) {
            return check6;
        }
        return "неизвестный";
    }
}
