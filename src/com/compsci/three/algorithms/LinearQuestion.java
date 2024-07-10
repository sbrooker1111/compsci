/*
Linear Search Question:

Write a Java method to find the first occurrence of a specified integer in an unsorted array.
The method should return the index of the integer if found, or -1 if the integer is not present in the array.
 */

package com.compsci.three.algorithms;

public class LinearQuestion {
    public static void main(String[] args) {
        int[] archer  = {9,1,8,2,7,3,6,4,5};
        int index = linearSearch(archer, 1);

        if(index != -1) {
            System.out.println("Element found at index " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] arr, int sought) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == sought) {
                return i;
            }
        }
        return -1;
    }
}

