/*
Program #1: Tax and Tip

        The program that you create for this exercise will begin by reading the cost of a meal
        ordered at a restaurant from the user. Then your program will compute the tax and tip
        for the meal. Use 13% when computing the amount of tax owing. Compute the tip as
        18% of the meal amount (before the tax). The output from your program should include the tax amount,
        the tip amount, and the grand total for the meal including both the tax and the tip.

        Format the output so that all of the values are displayed using two decimal places.
 */

package com.compsci.four;

import java.util.Scanner;
public class TaxTip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the meal price\n");
        double mealprice = scanner.nextDouble();

        double tax=0.13*mealprice;
        double tip=(mealprice)*0.18;
        double totalbill=tip+tax+mealprice;

        System.out.printf("Subtotal:\t %.2f\n",mealprice);
        System.out.printf("Tax:\t\t %.2f\n",tax);
        System.out.printf("Tip:\t\t %.2f\n",tip);
        System.out.printf("Total Bill:\t %.2f",totalbill);
    }
}