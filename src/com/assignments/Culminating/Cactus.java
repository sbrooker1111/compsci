package com.assignments.Culminating;

import java.util.Scanner;

public class Cactus {

    int needles;

    public static void main(String[] args) {

    }

    Cactus(int needles) {
        this.needles = needles;
    }

    static void countNeedles() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of needles: ");
        int needles = sc.nextInt();
    }

    void drinks() {
        System.out.println("Cactus stores litres of water");
    }

    void setNeedles(int needles) {
        this.needles = needles;
        System.out.printf("Cactus has a density of % needles per square centimeter\n", needles);
    }

    void sitsOnCactus(int buttSize) { // buttSize in square centimetres
        int needlesInbutt = needles * buttSize; // needles per square centimetre
        while (needlesInbutt > 0) {
            System.out.print(" Ouch! ");
            needlesInbutt--;
        }
    }

}
