package com.company;

import java.util.Scanner;

public class Circle {
    static final double PI = 3.14;
    static final double radius = 2.2;

    static void area(){
        double area = PI * (radius * radius);
        System.out.println(area);
    }
    static void circumference(){
        double circum = PI * 2 * radius;
        System.out.println(circum);

    }
}
