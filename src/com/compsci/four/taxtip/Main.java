// Tax should be 13%
// Tip should be 18%
package com.compsci.four.taxtip ;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mealprice");
        double mealprice = scanner.nextDouble();
        double tax=0.13*mealprice;
        double tip=(mealprice)*0.18;
        double totalbill=tip+tax+mealprice;

        System.out.printf("cost of mealprice:%f\n",mealprice);
        System.out.printf("tax:%f\n",tax);
        System.out.printf("tip:%f\n",tip);
        System.out.printf("totalbill:%f\n",totalbill);

    }
}