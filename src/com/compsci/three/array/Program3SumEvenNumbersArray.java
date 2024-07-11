/*
Write a Java program that calculates the sum of all even numbers in an array of integers.
 */

package com.compsci.three.array;

public class Program3SumEvenNumbersArray {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < (number.length -1); i++) {
        if (number[i] % 2 == 0) {
            sum += number[i];
            System.out.println(sum);
        }
        }
        System.out.println(sum);
    }
}
