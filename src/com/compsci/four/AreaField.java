/*
Program #2: Area of a Field:

Create a program that reads the length and width of a farmer’s field from the user in
feet. Display the area of the field in acres.
Hint: There are 43,560 square feet in once acre.
*/

package com.compsci.four;

import java.util.Scanner;
public class AreaField {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("To calculate the Area of a Field in Acres\n");  // output

        System.out.print("What is the width of the field, in feet: \n");
        double width = scanner.nextDouble();

        System.out.print("What is the length of the field in feet: \n");
        double length = scanner.nextDouble();

        double squareFeet;
        squareFeet = width * length;

        System.out.printf("areaField in squareFeet = %.2f \n", squareFeet);

        double acre;
        acre = squareFeet /43560;

        System.out.printf("areaField in acre = %.2f \n", acre);
    }
}