package com.company;

import java.util.Arrays;

public class Queue {
    private int[] list = new int[20];

    private int i = 0;

    void add(int element) {
        if (i == list.length) {
            list = Arrays.copyOf(list, list.length * 2 );
        }
        list[i] = element;
        i += 1;

    }

    public void print() {
        System.out.println("The queue is: ");
        for (int queue: list) {
            System.out.println(queue);
        }
    }
}
