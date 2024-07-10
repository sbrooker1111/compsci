/*
PROGRAM #1

Watch the following video tutorial and complete the BubbleSort program provided in the example.
  Modify your program to allow the user to enter the numbers, then store them in an array.
 */


package com.compsci.three.sort;
public class Program1BubbleSort {
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] args) {
        // Length of the array

         for (int i = 0; i < (args.length - 1) ; i++) {

             for (int j = 0; j < (args.length - 1 - i); j++) {

                if (args[j] > args[j + 1]) {
                    int temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;         //  int temp = array;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(args));
    }
}