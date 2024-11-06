package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }

    public class Dog implements Eat, Movable {
        public void move() {
        }

        public void eat() {
        }
    }

    public class Cat implements Eat, Movable, Edible {
        public void move() {
        }

        public void eat() {
        }

        public void beEaten() {
        }
    }

    public class Mouse implements Movable, Edible {
        public void move() {
        }

        public void beEaten() {
        }
    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }
}