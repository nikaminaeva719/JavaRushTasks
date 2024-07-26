package com.javarush.task.pro.task11.task1103;

public class Exmp {
    static int x;

    static String method(String y){
        x = Integer.parseInt(y);
        Exmp.Test test = new Exmp().new Test();
        return y;
    }

    public class Test{

    }
}

