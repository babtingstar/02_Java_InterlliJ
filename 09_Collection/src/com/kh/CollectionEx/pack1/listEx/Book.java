package com.kh.CollectionEx.pack1.listEx;

public class Book {
    private String author;
    private int price;

    public Book() {
    }

    public Book(String author, int price) {
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author, int price) {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
