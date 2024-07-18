/*
Program #5: Height Units:

Many people think about height in feet and inches, even in some countries that primarily use the metric
system. Write a program that reads a number of feet from the user, followed by a number of inches.
Once these values are read, your program should
compute and display the equivalent number of centimeters.

Hint: One foot is equal to 12 inches. One inch is equal to 2.54 centimeters.
*/
package com.compsci.exercises;
import java.util.Scanner;
public class HeightUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("To calculate the Height in inches and centimeters \n");  // output

        System.out.print("What is the Height of the person, in feet: \n");
        double  feet =   scanner.nextDouble();

        System.out.print("What is the Height of the person, in inch: \n");

        double inch =  scanner.nextDouble();

        double totalInch;
        totalInch= (feet/12) + inch;

        double centimeters = totalInch*2.54;
        System.out.printf("Your total Height in centimeters = %.2f \n", totalInch);

    }
}