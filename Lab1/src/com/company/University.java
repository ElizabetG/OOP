package com.company;
import com.company.Student;

public class University {
    private String name;
    private int foundationYear;
    private Student[] students;

    public University(String name, int foundationYear, Student[] students) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = students;
    }

    public void print() {
        System.out.println("The university " + name + " founded in " + foundationYear + " has many students: ");
        for (Student student: students) {
            System.out.println(student.name);
        }
    }

    public void averageCalc() {
        double sum = 0;
        int l = students.length;
        for (int i=0; i<l; i++) {
            sum += students[i].mark;
        }
        double avr = sum/l;
        System.out.println("The University " + name + " is ranked with an average of " + String.format("%.2f", avr) + ".");
    }
}

