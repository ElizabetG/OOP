package com.company;

public class Main {

    public static void main(String[] args) {
//        Box box1 = new Box();
//        Box box2 = new Box(2);
//        Box box3 = new Box(2,2,2);
//
//        box1.surface();
//        box1.volume();
//        box2.surface();
//        box2.volume();
//        box3.surface();
//        box3.volume();


        Queue queue1 = new Queue();
        for (int i = 0; i < 10000; i++) {
            queue1.add(5);
        }
        queue1.print();
    }


}
