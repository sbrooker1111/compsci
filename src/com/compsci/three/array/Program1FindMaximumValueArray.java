/*
    Write a Java program that takes an array of integers as input and finds
    the maximum value in the array. Assume the array is not empty.
*/


package com.compsci.three.array;

    public class Program1FindMaximumValueArray {
        public static void main(String[] args) {

            int[] arr = {3, 5, 7, 2, 8, 6, 4, 10, 1};
            int max = 0;

            for (int i = 0; i < (arr.length - 1); i++) {
                if ( max < arr[i]) {
                    max = arr[i];
                }
                System.out.println(max);
            }
            System.out.println("final" + max);
        }
    }

