package com.compsci.Module4;

import java.util.Scanner;

public class Bunnies {
    public static String name;
    public static Integer age;
    public static String breed;

    public static void main(String[] args) {
        adopt();
    }

    private static void adopt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your bunny's name: ");
        name = sc.nextLine();
        System.out.println("Enter your bunny's age: ");
        age = sc.nextInt();
        System.out.println("Enter your bunny's breed: ");
        breed = sc.next();
    }

    public static void flop() {
        System.out.printf("%s flops", name);
    }

    public static void hop(int moves) {
        System.out.printf("%s moves %i spaces", name, moves);
    }
}
