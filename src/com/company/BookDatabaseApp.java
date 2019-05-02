package com.company;

import java.util.Scanner;

public class BookDatabaseApp {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        System.out.println("SKU: ");
        String sku = input.nextLine();

        BookDatabase AB = new BookDatabase();

        AB.find(sku).getDisplayText();
    }
}
