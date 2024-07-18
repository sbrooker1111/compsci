/*
Instructions:
you will create a basic Java program that involves superclass (Parent class) and a subclass(Child class).
The program should demonstrate the inheritance of properties and methods from te superclass to the subclass.
 */

package com.compsci.Module4.Inheritance;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 30);
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
    }

//    void makeSound() {
//
//    }
}
