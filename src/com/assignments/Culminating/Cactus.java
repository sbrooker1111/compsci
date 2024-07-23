package com.assignments.Culminating;

import java.util.Scanner;

public class Cactus extends Plant {

    // Declares the needles to have at least 1
    int needles = 1;


    // Cacti do not have leaves so set leaves to 0, and replace with needles
    public Cactus() {
        super(0,1,1);
    }


    // Constructors
    public Cactus(int needles, int roots, int stems) {
        super(0, roots, stems);
        this.needles = needles;
    }

    Cactus(int needles, int roots) {
        super(0, roots, 1);
        this.needles = needles;
    }

    Cactus(int needles) {
        super(0, 1, 1);
        this.needles = needles;
    }

    // Getter/Setter for Needles variable
    public int getNeedles() {
        return needles;
    }

    public void setNeedles(int needles) {
        this.needles = needles;
    }


    // Prompts to set the number of needle density
    void countNeedles() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of needles per square centimetre: ");
        this.needles = sc.nextInt();
        sc.close();
    }

    // Takes in number of litres that the Cactus stores
    @Override
    public void drinksWater(int litres) {
        System.out.printf("Cactus stores %d litres of water\n", litres);
    }

    // method for sitting on the cactus, which hurts
    // buttSize in square centimetres
    void sitsOnCactus(int buttSize) {
        // needles per square centimetre times the size of the surface area connected
        if (buttSize > 0) {
            int needlesInbutt = needles * buttSize;
            while (needlesInbutt > 0) {
                // format the output to only write upto 10 times per line
                if ((needlesInbutt % 10) == 0) {
                    System.out.print(" Ouch! \n");
                } else {
                System.out.print(" Ouch! ");
                }
                needlesInbutt--;
            }
        } else {
            System.out.println("you didn't sit on the cactus, good for you\n");
        }

    }
}
