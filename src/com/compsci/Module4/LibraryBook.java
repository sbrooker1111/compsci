/*
You will create a class Book with multiple constructors to handle different scenarios of book creation.
You will then create a small program that uses these constructors to manage a collection of books in a library.
 */

package com.compsci.Module4;

class Book {

    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    // no-args constructor
    Book() {
        title = "Title of Book";
        author = "Author of Book";
        ISBN = "ISBN of Book";
        yearPublished = 2000;
    }

    // constructor with two args
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        ISBN = "ISBN of Book";
        yearPublished = 2000;
    }

    // constructor of all args
    Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Year Published: " + yearPublished);
    }
}

public class LibraryBook {

    public static void main(String[] args) {
        Book bookNone = new Book();
        Book bookTwo = new Book("Sophie's World", "Jostein Gaarder");
        Book bookALL = new Book("Sophie's World", "Jostein Gaarder", "978-1-85799-291-5", 1994);

        System.out.println("\nBook no Args");
        bookNone.printDetails();

        System.out.println("\n\nBook Two Args");
        bookTwo.printDetails();

        System.out.println("\n\nBook All Args");
        bookALL.printDetails();
    }
}
