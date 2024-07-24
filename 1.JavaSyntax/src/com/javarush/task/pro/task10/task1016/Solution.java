package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        System.out.println(String.format("В городе %s сегодня температура воздуха %d", city.getName(), city.getTemperature()));
    }

    public static void main(String[] args) {
        City odi = new City("Одинцово",25);
        showWeather(odi);
    }
}
