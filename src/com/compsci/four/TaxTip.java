// Tax should be 13%
// Tip should be 18%
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
        System.out.printf("Total Bill:\t %.2f\n",totalbill);
    }
}