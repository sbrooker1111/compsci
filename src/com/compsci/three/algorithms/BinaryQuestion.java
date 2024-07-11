/*
Binary Search Question:

Given a sorted array of integers, write a Java method to find the index of a specified integer using binary search.
The method should return the index of the integer if found, or -1 if the integer is not present in the array.
 */


package com.compsci.three.algorithms;

public class BinaryQuestion {

    public static void main(String[] args) {

        int[] oreo = new int[100];
        int target = 42;

        // fill array with data
        for (int i = 0; i < oreo.length; i++) {
            oreo[i] = i;
        }

        // int index = Array.binarySearch(array, target);
        int index = binarySearch2(oreo, target);

        if (index == -1) {
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at: " + index);
        }

    }

    private static int binarySearch2(int[] oreo, int target) {
//
         int low = 0;
         int high = oreo.length - 1;

         while (low <= high) {
             int mid = (low + high) / 2;
             int value = oreo[mid];

             System.out.println("middle: " + value);

             if(value < target){
                 low = mid + 1;
             }
             else if(value > target) high = mid - 1;
             else return mid; // target found
         }
    return -1;
    }
}


