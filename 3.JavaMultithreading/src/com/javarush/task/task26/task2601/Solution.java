package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {
//        Integer[] array = {13, 8, 15, 5, 17};
//        sort(array);
//        System.out.println(Arrays.toString(array));
    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        int median;
        if (array.length % 2 != 0) {
            median = array[array.length / 2];
        } else {
            median = (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
        }
        Comparator<Integer> comparator = (a, b) -> (Math.abs(median - a) - Math.abs(median - b));
        Arrays.sort(array, comparator);
        return array;
    }
}
