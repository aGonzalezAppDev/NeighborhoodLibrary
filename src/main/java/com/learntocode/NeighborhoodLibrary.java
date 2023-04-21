package com.learntocode;

import java.util.Scanner;

public class NeighborhoodLibrary {
    // making global variables
    private static Book[] books = new Book[5];
    private static int numBooks = 5;

    public static void main(String[] args) {
        // objects of books
        books[0] = new Book(1, "978-1-945209-05-1", "Little Pony");
        books[1] = new Book(2, "978-1-945209-05-2", "Dumbo");
        books[2] = new Book(3, "978-1-945209-05-3", "Art of War");
        books[3] = new Book(4, "978-1-945209-05-4", "Snow White");
        books[4] = new Book(5, "978-1-945209-05-4", "Blue Lock");

        Scanner myScanner = new Scanner(System.in);

        // while loop with switch for menu
        while (true) {
            System.out.println("Choose an option");
            System.out.println(" 1 - Show Available Books");
            System.out.println(" 2 - Show Checked out Books");
            System.out.println(" 3 - [Exit]");
            System.out.println("Enter your choice:");

            int choice = myScanner.nextInt();
            myScanner.nextLine();

            switch (choice) {
                case 1:
                    // show all books
                    break;
                case 2:
                    // show checked out books
                    break;
                case 3:
                    // exit to close out of screen
                    return;
                default:
                    System.out.println("Choose a valid choice!!");
                    break;
            }

        }
    }



}
