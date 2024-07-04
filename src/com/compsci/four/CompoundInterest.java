/*
Program #3: Compound Interest:

Pretend that you have just opened a new savings account that earns 4% interest per
year. The interest that you earn is paid at the end of the year, and is added to the
balance of the savings account. Write a program that begins by reading the amount of
money deposited into the account from the user. Then your program should compute
and display the amount in the savings account after 1, 2, and 3 years. Display each
amount so that it is rounded to two decimal places.
 */
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