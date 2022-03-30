package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCircle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted: ");
        for (Circle circle: circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                if (o1.getRadius() > o2.getRadius()) {
                    return 1;
                } else if (o1.getRadius() < o2.getRadius()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (Circle circle: circles) {
            System.out.println(circle);
        }
    }
}
