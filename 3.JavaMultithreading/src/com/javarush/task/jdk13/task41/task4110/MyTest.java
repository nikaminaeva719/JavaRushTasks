package com.javarush.task.jdk13.task41.task4110;

public class MyTest {
    private String name;
    private int age;

    MyTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static MyTestBuilder builder() {
        return new MyTestBuilder();
    }

    public static class MyTestBuilder {
        private String name;
        private int age;

        MyTestBuilder() {
        }

        public MyTestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public MyTestBuilder age(int age) {
            this.age = age;
            return this;
        }

        public MyTest build() {
            return new MyTest(this.name, this.age);
        }

        public String toString() {
            return "MyTest.MyTestBuilder(name=" + this.name + ", age=" + this.age + ")";
        }
    }
}

class Main {
    public static void main(String[] args) {
        MyTest n = MyTest.builder().age(24).name("N").build();
    }
}

