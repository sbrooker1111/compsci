/*
 Program #4: Speed Calculator:
 Write a program that calculates the average speed based on the formula:

 Speed = distance / time

 Your program should prompt the user for the distance travelled and time spent
 travelling, then output their average speed on a single line with a meaningful output
 statement.
 */


package com.compsci.exercises;

import java.util.Scanner;
public class SpeedCalcuator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How fast where you going?");
        System.out.println("How far did you travel? (km)");
        int distance = scanner.nextInt();

        System.out.println("How long did it take you? (hours)");
        int time = scanner.nextInt();

        int speed;
        speed = distance / time;

        System.out.printf("You were travelling %d km/h", speed);

    }
}