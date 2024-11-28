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
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        return books;
    }

    public ArrayList<Book> searchBook(String bookTitle) {
        for(int i = 0; i < books.size(); i++) {
            if(books.get(i).getTitle().equals(bookTitle)) {
                return books;
            }
        }
        System.out.println("Book not found");
        return null;
    }

    public Book deleteBook(String bookTitle, String author) {
        for(int i = 0; i < books.size(); i++) {
            if(books.get(i).getTitle().equals(bookTitle) && books.get(i).getAuthor().equals(author)) {
                books.remove(i);

            }
        }
        return book;
    }

}
