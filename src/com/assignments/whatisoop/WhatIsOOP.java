package com.assignments.whatisoop;

import java.util.Scanner;

public class WhatIsOOP {
    public static void main(String[] args) {

        Bunnies oreo = new Bunnies();
        oreo.adopt();
        oreo.flop();
        Scanner sc = new Scanner(System.in);
        System.out.printf("How many steps does %s take?\n", oreo.name);
        int steps = sc.nextInt();
        oreo.hop(steps);

        Bunnies piper = new Bunnies();
        piper.adopt();
        piper.flop();
        System.out.printf("How many steps does %s take?\n", piper.name);
        steps = sc.nextInt();
        piper.hop(steps);


    }
}
