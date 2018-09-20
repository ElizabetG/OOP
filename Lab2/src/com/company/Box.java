package com.company;

public class Box {
    public double height;
    public double width;
    public double depth;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box(double measurement) {
        this.height = measurement;
        this.width = measurement;
        this.depth = measurement;
    }

    public Box() {
        this.height = 2;
        this.width = 2;
        this.depth = 2;
    }

    public void surface() {
        double surface = 2 * (height * height + width * width + depth * depth);
        System.out.println("The area of the box is " + surface + " square meters.");
    }


    public void volume() {
        double volume = height * width * depth;
        System.out.println("The volume of the box is " + volume + " cubic meters.");
    }
}
