package com.company;

public class Student {
    public String name;
    public int age;
    public float mark;

    public Student(String name, int age, float mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public void printObject() {
        System.out.println("The student " + name + " is " + age + " years old and has the mark " + mark);
    }
}
