package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Eliza", 18, 9.6f);
        student1.printObject();
        Student student2 = new Student("Ina", 22, 9.2f);
        student2.printObject();
        Student student3 = new Student("Ana", 21, 9.8f);
        student3.printObject();

//        Scanner scanner = new Scanner(System.in);
//        String result = scanner.nextLine();
//        int intResult = Integer.parseInt(result);
//        System.out.println(result);
//        System.out.println(intResult);

        University university1 = new University("UTM", 1960, new Student[] {student1, student2, student3});
        university1.print();
        university1.averageCalc();


        Student student4 = new Student("Beta", 20, 9.6f);
        Student student5 = new Student("Ala", 22, 9.4f);
        University university2 = new University("ULIM", 1970, new Student[] {student4, student5});
        university2.print();
        university2.averageCalc();


        Student student6 = new Student("Elena", 21, 9.9f);
        Student student7 = new Student("Ed", 22, 9.4f);
        University university3 = new University("ASEM", 1965, new Student[] {student6, student7});
        university3.print();
        university3.averageCalc();
    }



















    //        Monitor monitor1 = new Monitor("red",1200, 1800, 1440);
//        monitor1.updateObject("blue", 1300, 2100, 720);
//        monitor1.printObject();
//
//        Monitor monitor2 = new Monitor("gr", 1300, 2100, 720);
//        monitor2.printObject();
//
//        if (monitor1.color == monitor2.color && monitor1.height == monitor2.height && monitor1.width == monitor2.width && monitor1.resolution == monitor2.resolution) {
//            System.out.println("Monitor1 is equal to Monitor2.");
//        } else
//            System.out.println("Monitor1 is not equal to Monitor2.");
}