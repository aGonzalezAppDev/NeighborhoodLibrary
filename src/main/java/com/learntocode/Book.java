package com.learntocode;

public class Book {
    private int id;
    private String isbn; // International book number
    private String author;
    private String title;

    // create constructor
    public Book(int id, String author, String title){
        this.id = id;
        this.author = author;
        this.title = title;
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
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(){
        this.isbn = isbn;
    }

    

}