package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorRectangle {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(2.3, 5.8);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(2.5, 3.8, "orange", true);

        System.out.println("Pre-sorted: ");
        for (Rectangle rectangle: rectangles) {
            System.out.println(rectangle);
        }

        Arrays.sort(rectangles, new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                if (o1.getPerimeter() > o2.getPerimeter()) {
                    return 1;
                } else if (o1.getPerimeter() < o2.getPerimeter()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("-------------");
        System.out.println("After-sorted: ");
        for (Rectangle rectangle: rectangles) {
            System.out.println(rectangle);
        }
    }
}
