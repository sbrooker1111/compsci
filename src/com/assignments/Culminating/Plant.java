/*
In this project, you will design and implement an inheritance tree in Java. The project
requires you to create at least two classes that demonstrate the concepts of
inheritance. You will define instance methods and variables for these classes, ensuring
that your code adheres to Java best practices. Finally, you will create a video
explaining your code step by step.
 */

package com.assignments.Culminating;

public class Plant {

    // Declares the instance variables
    int leaves = 1;     // number of leaves
    int roots = 1;      // number of or length of roots
    int stems = 1;      // number of or length of stems

    // Constructors

    public Plant(int leaves, int roots, int stems) {
        this.leaves = leaves;
        this.roots = roots;
        this.stems = stems;
    }

    // Leaves
    public int getLeaves() {
        return leaves;
    }
    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }

    // Roots
    public int getRoots() {
        return roots;
    }
    public void setRoots(int roots) {
        this.roots = roots;
    }

    // Stems
    public int getStems() {
        return stems;
    }
    public void setStems(int stems) {
        this.stems = stems;
    }

    // Activity Methods
    // takes the number of stems added and prints out that many times "plant grows"
    public void grows(int stems) {
        for (int i = 0; i <= stems; i++) {
            System.out.print("plant grows\n");
        }
    }

        // takes in any string as food for the plant but will only respond to light for photosynthesis
    public void eat(String food) {
            if (food == "light") {
                System.out.print("plant photosynthesizes\n");
            } else {
                System.out.print("plant does nothing\n");
            }
        }

    public void drinksWater (int litres) {
            System.out.printf("plant drinks %s litres of water\n", litres);
        }

}




