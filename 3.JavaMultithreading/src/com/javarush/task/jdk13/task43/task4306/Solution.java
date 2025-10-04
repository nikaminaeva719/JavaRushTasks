package com.javarush.task.jdk13.task43.task4306;

/* 
В поиске ботана
*/

import org.apache.commons.lang3.ObjectUtils;

import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        Student studentOne = new Student("Joe", 10, 8, 7, 7, 5, 6, 9);
        Student studentTwo = new Student("Jane", 8, 9, 5, 6, 7, 7, 8);

        String result = compareStudentGrades(studentOne, studentTwo);
        System.out.println(result);
    }

    public static String compareStudentGrades(Student studentOne, Student studentTwo) {
        if (Objects.isNull(studentOne) || Objects.isNull(studentTwo)) {
            System.out.println("Make sure there are no null objects");
        }
        int mathScoreCompare = ObjectUtils.compare(studentOne.getMathScore(), studentTwo.getMathScore());
        int physicsScoreCompare = ObjectUtils.compare(studentOne.getPhysicsScore(), studentTwo.getPhysicsScore());
        int chemistryScoreCompare = ObjectUtils.compare(studentOne.getChemistryScore(), studentTwo.getChemistryScore());
        int biologyScoreCompare = ObjectUtils.compare(studentOne.getBiologyScore(), studentTwo.getBiologyScore());
        int geographyScoreCompare = ObjectUtils.compare(studentOne.getGeographyScore(), studentTwo.getGeographyScore());
        int historyScoreCompare = ObjectUtils.compare(studentOne.getHistoryScore(), studentTwo.getHistoryScore());
        int englishScoreCompare = ObjectUtils.compare(studentOne.getEnglishScore(), studentTwo.getEnglishScore());

        int total = mathScoreCompare
                + physicsScoreCompare
                + chemistryScoreCompare
                + biologyScoreCompare
                + geographyScoreCompare
                + historyScoreCompare
                + englishScoreCompare;
        if (total > 0) {
            return studentOne.getName() + "has a higher grades score";
        } else if (total < 0) {
            return studentTwo.getName() + "has a higher grades score";
        } else return "Student grades scores are equal";

    }
}


