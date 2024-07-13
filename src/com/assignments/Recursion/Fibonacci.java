package com.assignments.Recursion;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
            // Scanner for user interaction
        Scanner scanner = new Scanner(System.in);
         // Intro and Prompt
        System.out.print("What Fibonacci Number is it?\nEnter a positive integer to find what fibonacci number is in that position:\n");
        int place = scanner.nextInt();
            // Run and print to screen the result
        System.out.println("\n the number " + fibonacci(place));

    }

    private static long fibonacci(int n) {
            // base case
        if (n <= 1) {
            System.out.println("return " + n);
            return n;
        }
            // take the position and subtract 1 then subtract 2, then add them together
        int mOne = n - 1;
        int mTwo = n - 2;
        System.out.println(n + "  " + mOne + "  " + mTwo);
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

