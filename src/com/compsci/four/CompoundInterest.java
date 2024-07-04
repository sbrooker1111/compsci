package com.compsci.four;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you initial account balance\n");
        double initialBalance = scanner.nextDouble();


        for(int i = 0 ; i < 4; i++) {
            System.out.printf("Balance as of Year %s is:\t %.2f\n", i, initialBalance * Math.pow(1.04,i) );
        }
    }
}