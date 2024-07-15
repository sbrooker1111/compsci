package com.assignments.Recursion;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        // Scanner for user interaction
        Scanner scanner = new Scanner(System.in);
        // Intro and Prompt
        System.out.println("What Fibonacci Number is it?\nEnter a positive integer to find what fibonacci number is in that position:\n");
        int place = scanner.nextInt();

        // Run and print to screen the result
        System.out.println("\nThe number in the " + place + " of the fibonacci series is " + fibonacci(place));

    }

    private static long fibonacci(int n) {
        // Base case
        if (n <= 1) {
            return n;
        }
        // take the position and subtract 1 then subtract 2, then add them together
                // instance one         instance two
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

