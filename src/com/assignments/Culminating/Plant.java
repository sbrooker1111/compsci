/*
In this project, you will design and implement an inheritance tree in Java. The project
requires you to create at least two classes that demonstrate the concepts of
inheritance. You will define instance methods and variables for these classes, ensuring
that your code adheres to Java best practices. Finally, you will create a video
explaining your code step by step.
 */

package com.assignments.Culminating;

public abstract class Plant {

    int leaves;
    int roots;
    int stems;

    void grows(int spaces) {
        for (int i = 0; i <= spaces; i++) {
            System.out.print(" plant grows ");
        }
    }

    void eat(String food) {
        System.out.print(" plant photosynthesizes ");
    }

    void drinksWater() {
        System.out.print(" plant drinks water");
    }
}

