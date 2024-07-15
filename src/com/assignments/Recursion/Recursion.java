package com.assignments.Recursion;

public class Recursion {
    public static long factorial (int number) {
        if (number <= 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}
