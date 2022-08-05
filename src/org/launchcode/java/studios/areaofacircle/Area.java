package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = input.nextDouble();
//        boolean checkRadius = radius instanceof Double;
        do {
            System.out.println("Enter a valid number!");
            System.out.println("Enter radius: ");
            radius = input.nextDouble();
        } while (radius <= 0);
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is " + area);
            input.close();
    }
}
