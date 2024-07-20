package com.javarush.task.pro.task09.task0913;

public class Point {
    private int superX;
    private int myX;
    public int y;

    public Point(int x, int y) {
        this.superX = x;
        this.y = y;
    }

    public int getX() {

        return superX;
    }

    public void setX(int x) {

        this.superX = x;
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Main {
    public static void main(String[] args) {
        Point point = new Point(5,10);
        point.setX(6);
        System.out.println(point.getX());
    }
}