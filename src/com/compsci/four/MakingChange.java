/*
Program #6: Making Change:

Consider the software that runs on a self-checkout machine. One task that it must be
able to perform is to determine how much change to provide when the shopper pays for a 
purchase with cash.  Write a program that begins by reading a number of cents from the user 
as an integer.  Then your program should compute and display the denominations of the coins that
should be used to give that amount of change to the shopper. The change should be given using as few 
coins as possible. Assume that the machine is loaded with pennies, nickels, dimes, quarters, loonies 
 and toonies.
 */

package com.compsci.four;

import java.util.Scanner;

public class MakingChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mount of cash\n");
        double payment = scanner.nextDouble();



        int pennies = 1;
        int nickels = 5;
        int dimes = 10;
        int quarters = 25;
        int loonies = 100;
        int toonies = 200;


        int change = pennies + nickels + dimes + quarters + loonies + toonies;


        System.out.printf("Subtotal:\t %\n", cash);
        System.out.printf("Tax:\t\t %\n", change);

        
//        System.out.printf("Tip:\t\t %\n");
//        System.out.printf("Total Bill:\t %");
    }
}