/*
Write a Java program that reverses the elements of an array. For example, if the input array is {1, 2, 3, 4, 5},
the output should be {5, 4, 3, 2, 1}.
 */

package com.compsci.three;

public class Program2ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = (numbers.length - 1); i > -1  ;  i--) {
            System.out.println(numbers[i]);
        }

    }
}

