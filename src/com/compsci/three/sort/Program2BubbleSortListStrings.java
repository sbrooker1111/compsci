/*
PROGRAM #2

Bubble Sort with a List of Strings
Implement a bubble sort algorithm to sort an array of strings in alphabetical order.
You will need to create a method called 'bubbleSort() and pass the unsorted array as
an argument.
 */

package com.compsci.three.sort;

import java.util.Arrays;

public class Program2BubbleSortListStrings {
    public static void main(String[] args) {

        String[] arr = {"banana", "apple", "grape", "cherry", "blueberry"};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (String s : arr) {
            System.out.println(s + " ");
        }
    }

    public static void bubbleSort(String[] args) {

        for (int i = 0; i < (args.length - 1); i++) {
            for (int j = 0; j < (args.length - 1 - i); j++) {

                if (args[j].compareTo(args[j + 1]) > 0) {
                    String temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(args));
    }

}
