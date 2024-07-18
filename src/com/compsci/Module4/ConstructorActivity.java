package com.compsci.Module4;

//public class ConstructorActivity {
//    // Creating a constructor
//    ConstructorActivity() {
//        System.out.println("Hello, World!");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("The main() method.");
//
//        // Creating a class's object
//        // that will invoke the constructor
//        ConstructorActivity obj_x = new ConstructorActivity();
//    }
//}
//public class ConstructorActivity {
//    int num1;
//    int num2;
//
//    public static void main(String[] args) {
//        // We didn't created any structure
//        // a default constructor will invoke here
//        ConstructorActivity obj_x = new ConstructorActivity();
//
//        // Printing the values
//        System.out.println("num1 : " + obj_x.num1);
//        System.out.println("num2 : " + obj_x.num2);
//    }
//}
//public class ConstructorActivity {
//    int num1;
//    int num2;
//
//    // Creating no-args constructor
//    ConstructorActivity() {
//        num1 = -1;
//        num2 = -1;
//    }
//
//    public static void main(String[] args) {
//        // no-args constructor will invoke
//        ConstructorActivity obj_x = new ConstructorActivity();
//
//        // Printing the values
//        System.out.println("num1 : " + obj_x.num1);
//        System.out.println("num2 : " + obj_x.num2);
//    }
//}
//public class ConstructorActivity {
//    int num1;
//    int num2;
//
//    // Creating parameterized constructor
//    ConstructorActivity(int a, int b) {
//        num1 = a;
//        num2 = b;
//    }
//
//    public static void main(String[] args) {
//        // Creating two objects by passing the values
//        // to initialize the attributes.
//        // parameterized constructor will invoke
//        ConstructorActivity obj_x = new ConstructorActivity(10, 20);
//        ConstructorActivity obj_y = new ConstructorActivity(100, 200);
//
//        // Printing the objects values
//        System.out.println("obj_x");
//        System.out.println("num1 : " + obj_x.num1);
//        System.out.println("num2 : " + obj_x.num2);
//
//        System.out.println("obj_y");
//        System.out.println("num1 : " + obj_y.num1);
//        System.out.println("num2 : " + obj_y.num2);
//    }
//}
// Example of Java Constructor Overloading
// Creating a Student Class
class Student {
    String name;
    int age;

    // no-args constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // parameterized constructor having one parameter
    Student(String name) {
        this.name = name;
        this.age = 0;
    }

    // parameterized constructor having both parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}

public class ConstructorActivity {
    public static void main(String[] args) {
        Student std1 = new Student(); // invokes no-args constructor
        Student std2 = new Student("Jordan"); // invokes parameterized constructor
        Student std3 = new Student("Paxton", 25); // invokes parameterized constructor

        // Printing details
        System.out.println("std1...");
        std1.printDetails();

        System.out.println("std2...");
        std2.printDetails();

        System.out.println("std3...");
        std3.printDetails();
    }
}
