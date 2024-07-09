/*
Program #10: Units of Time:

Create a program that reads a duration from the user as a number of days, hours,
minutes, and seconds. Compute and display the total number of seconds represented by this duration.
 */

package com.compsci.four;
import java.util.Scanner;
public class UnitsTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("To calculate the number of seconds given a specific time in days, hours, and minutes");

        System.out.println("Number of Days");
        int days = scanner.nextInt();

        System.out.println("Number of hours");
        int hours = scanner.nextInt();

        System.out.println("Number of minutes");
        int minutes = scanner.nextInt();

        System.out.println("Number of seconds");
        int seconds = scanner.nextInt();

        int total = days * 86400 + hours * 3600 + 60 * minutes + seconds;

        System.out.printf("The number seconds in %d days, %d hours, %d minutes and %d seconds are %d", days, hours, minutes, seconds, total);


    }
}
