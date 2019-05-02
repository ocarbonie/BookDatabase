package com.company;

import java.util.HashMap;

public class BookDatabase {
    private String SKU;
    private HashMap<String, Book> books = new HashMap<>();
    private Book a, b, c, d, e, f;


    public BookDatabase(){
        a = new Book("Kathy Sierra and Bert Bates", "Head First Java", "Easy to read Java workbook", 47.50);
        books.put("Java1001", a);

        b = new Book("Bruce Eckel", "Thinking in Java", "Details about Java under the hood", 20.00);
        books.put("Java1002", a);

        c = new Book("Jeanne Boyarsky", "OCP: Oracle Certified Professional Java SE", "Everything you need to know in one place", 45.00);
        books.put("Orcl1003", c);

        d = new Book("Al Sweigart", "Automate the Boring Stuff with Python", "Fun with Python", 10.50);
        books.put("Python1004", d);

        e = new Book("Simon Monk", "The Maker's Guide to the Zombie Apocalypse", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50);
        books.put("Zombie1005", e);

        f = new Book("Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 	14.75);
        books.put("Rasp1006", f);
    }

    public Book find(String SKU) {
        return books.get(SKU);
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }








}