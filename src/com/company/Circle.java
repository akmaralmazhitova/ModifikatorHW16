package com.company;

import java.util.Scanner;

public class Circle {
     final double PI = 3.14;
     final double radius = 2.2;

    public void area(){
        double area = PI * (radius * radius);
        System.out.println(area);
    }
    public void circumference(){
        double circum = PI * 2 * radius;
        System.out.println(circum);

    }
}
