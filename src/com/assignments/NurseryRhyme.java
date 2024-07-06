/*
ICS4U8G-d Minor Assignment:
Methods in Java

Objective:

Create a Java program that prints the lyrics of a chosen nursery rhyme.
The program should use methods to reduce redundancy and improve readability.

Sophie Brooker <sbrooker@aeo3.ca>
(C) 2024
*/

package com.assignments;

public class NurseryRhyme {
    public static void main() {

// Since the first 2 stanzas repeat 3 times, I used a loop
        for (int i = 0 ; i < 3; i++) {
            printlnLyrics1();
            printlnLyrics2();
            printlnLyrics3();
            printlnLyrics4();
        }
        printlnLyrics5();
        printlnLyrics2();
        printlnLyrics3();
        printlnLyrics6();
    }

    public static void printlnLyrics1() {
        System.out.println("The itsy bitsy spider want up the water spout.");
    }
    public static void printlnLyrics2 () {
        System.out.println("Down came the rain and washed the spider out.");
    }
    public static void printlnLyrics3 () {
        System.out.println("Out came the sun and dried up all the rain.");
    }
    public static void printlnLyrics4() {
        System.out.println("Then the itsy bitsy spider went up the spout again.\n");
    }
    public static void printlnLyrics5() {
        System.out.println("The big, big spider went up the water spout.");
    }
    public static void printlnLyrics6() {
        System.out.println("Then the big, big spider went up the spout again.");
    }
}


