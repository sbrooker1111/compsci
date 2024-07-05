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
        double Cash = scanner.nextDouble();

        Int pennies = 1;
        Int nickels = 5;
        Int dimes = 10;
        Int quarters = 25;
        Int loonies = 100;
        Int toonies = 200;
        Int change = pennies + nickels + dimes + quarters + loonies + toonies;


        System.out.printf("Subtotal:\t %.2f\n",Cash);
        System.out.printf("Tax:\t\t %.2f\n",change);

        System.out.printf("Tip:\t\t %.2f\n");
        System.out.printf("Total Bill:\t %.2f");
    }
}