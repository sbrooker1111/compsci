//package com.scratch;
//
//import java.util.Scanner;
//
//public class UsingLoops {
//
//    public static void main(String[] args) {
//
//        int[] numbers = {3, 5, 7, 2, 8, 6, 4, 10, 1};
//        printArray(numbers);
//        fillArray(numbers);
//        printArray(numbers);
//    }
//
//
//    private static void fillArray(int[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Fill array\n");  // output
//        for (int i = 0; i < args.length; i++) {
//            System.out.println("currently" + args[i] + "    Now a new number ");
//            args[i] = Integer.parseInt(scanner.nextLine());
//        }
//    }
//
//    private static void printArray(int[] args) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//    }
//
//
//}