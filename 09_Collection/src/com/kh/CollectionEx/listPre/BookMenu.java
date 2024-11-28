package com.kh.CollectionEx.listPre;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();
    Book book = new Book();

    public void insertBook() {
        System.out.println("Enter the name of the book: ");
        String name = sc.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = sc.nextLine();
        System.out.println("Enter the category of the book: ");
        String category = sc.nextLine();
        System.out.println("Enter the price of the book: ");
        int price = sc.nextInt();
        Book addBook = new Book(name, author, category, price);
        books.add(addBook);
        System.out.println("Book added");
    }

    public ArrayList<Book> selectList() {
        return books;
    }

    public ArrayList<Book> searchBook(String bookTitle) {
        return books;
    }

    public Book deleteBook(String bookTitle, String author) {
        return book;
    }

}
