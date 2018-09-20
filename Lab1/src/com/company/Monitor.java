package com.company;

public class Monitor {
    public String color ;
    public int height;
    public int width;
    public int resolution;


    public Monitor(String color, int height , int width, int resolution) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.resolution = resolution;
    }

    public void printObject() {
        System.out.println("Monitor1 has the color " + color + " and the dimensions " + height + "x" + width + ". The resolution is " + resolution + "px.");
    }

    public void updateObject(String color, int height , int width, int resolution) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.resolution = resolution;
    }
}
