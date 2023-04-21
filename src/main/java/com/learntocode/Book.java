package com.learntocode;

public class Book {
    private int id;
    private String isbn; // International book number
    private String author;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    // create a constructor to create objects in the main
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // getters and setters for id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // getters and setters for author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // getters and setters for title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // getters and setters for isbn
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // setters & getters for checked out
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    public void setIsCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    // method for when book is checked out
    public void checkOut(String name) {
        this.checkedOutTo = name;
        this.isCheckedOut = true;

    }

    // method for when book is checked in
    public void checkIn(){
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }




}
