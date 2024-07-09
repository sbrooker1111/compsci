/*
Program #7: Area of a Triangle:

The area of a triangle can be computed by the following formula, where b is the length of
the base of the triangle, and h is its height:

 area = b x h / 2

Write a program that allows the user to enter values for b and h.
 The program should then compute and display the area of a triangle with base length b and height h.
 */

package com.compsci.four;
import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the value for base\n");  // output
        double base = scanner.nextDouble();

        System.out.print("What is the value for hieght \n");
        double height = scanner.nextDouble();

        double area;
        area = (base * height) / 2;
        System.out.print("The area of the triangle with a height of " + height + " and a base of " + base + " is " + area);
    }
}

