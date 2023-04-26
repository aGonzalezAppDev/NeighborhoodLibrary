package com.learntocode;

import java.util.Scanner;

public class NeighborhoodLibrary {
    // making global variables
    private static Book[] books = new Book[10];
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
                    // Display all books that are not checked out with all elements
                    //call the display method for available books
                    availableBooks();
                        // select book to check out or exit back to the homescreen
                        // if checking out prompt for name / then check out book
                    bookSelect(myScanner);
                    break;
                case 2:
                    // show checked out books with all elements / and name of the person who checked out
                    checkedOutBooks();
                        // prompt user to check in book- (C) or exit to homescreen - (X)
                    checkInBook(myScanner);
                    break;
                case 3:
                    // exit to close out of screen
                    System.out.println("[Exit]");
                    return;
                default:
                    System.out.println("Choose a valid choice!!");
                    break;
            }

        }
    }


    public static void availableBooks(){
        // print out all books which arent checked out
        System.out.println("Available books:");

        // iterate through books
        for (int i = 0; i < numBooks; i++){
            System.out.println(books[i].getId() + " | " + books[i].getIsbn() + " | " + books[i].getTitle());

        }
    }

    public static void bookSelect(Scanner myScanner){
        System.out.println("Enter book choice: ");
        int bookNumber = myScanner.nextInt();

        for (int i = 0; i < numBooks; i++){
            if(books[i].getId()==bookNumber) {
                System.out.println(books[i].getId() + " | " + books[i].getIsbn() + " | " + books[i].getTitle());
                System.out.println("Provide name as shows : First and Last name");
                checkOut(myScanner.nextLine());
            } else {
                System.out.println("[Exit]");
                break;
            }
        }
    }

    // checked out books display method
    public static void checkedOutBooks(){
        System.out.println("Checked Out Books: ");
        for(int i = 0; i < numbooks; i++) {
            if (books.isCheckedOut == true) {
                System.out.println(books[i].getId() + " | " + books[i].getIsbn() + " | " + books[i].getTitle() " | "
                + books[i].getCheckedOutTo());
            }
        }
    }

    public static void checkInBook(Scanner myScanner){
        System.out.println("Would You like to [Check in] a book or [Exit]? : ");
        String answer = myScanner.nextLine();
        if(answer.equalsIgnoreCase("Check in")) {
            checkIn();
        } else {
            System.out.println("Exit to Home Screen");
            break;
        }
    }



}
