/*
    Write a Java program that takes an array of integers as input and finds
    the maximum value in the array. Assume the array is not empty.
*/

package com.compsci.three.array;

public class Program1FindMaximumValueArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 6, 4, 10, 1};

        int sizeArray = numbers.length;

        System.out.println("the Array is of length: " + sizeArray);
        int[] newNumbers = sortArray(numbers);
        System.out.println("Maximum value in the array is " + newNumbers[sizeArray - 1]);

    }

    public static int[] sortArray(int[] inputArray) {
        for (int i = 0; i < (inputArray.length - 1); i++) {
//            System.out.println("======");
//            System.out.println(java.util.Arrays.toString(inputArray) + "       F loop " + (i + 1));
            for (int j = 0; j < (inputArray.length - 1) - i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
//                    System.out.println("\n" + inputArray[j] + " and " + inputArray[j + 1]);
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
//                    System.out.println(inputArray[j] + " and " + inputArray[j + 1]);
//                    System.out.println("     " + java.util.Arrays.toString(inputArray) + "  S loop " + (j + 1));
                }
            }
        }
        return inputArray;
    }


}

