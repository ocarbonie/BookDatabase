package com.company;

public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public Book(){

    }
    public Book(String author, String title, String desc, double price){
        this.author = author;
        this.title = title;
        this.description = desc;
        this.price = price;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
    public void getDisplayText(){
        System.out.println("Author: " + author +
                          "\nTitle: " + title +
                          "\nDescription: " + description );
    }
}
