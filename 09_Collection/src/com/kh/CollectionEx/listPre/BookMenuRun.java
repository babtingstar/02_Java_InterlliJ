package com.kh.CollectionEx.listPre;

import java.util.Scanner;

public class BookMenuRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookMenu bookMenu = new BookMenu();

        while (true) {
            System.out.println("--------------------");
            System.out.println(" Book Menu");
            System.out.println(" 1. insertBook");
            System.out.println(" 2. selectList");
            System.out.println(" 3. searchBook");
            System.out.println(" 4. deleteBook");
            System.out.println(" 5. exit");
            System.out.println("--------------------");
            System.out.print("\n Enter your choice: ");

            int choice = sc.nextInt();

            String bookTitle = "title";
            String author = "author";
            switch (choice) {
                case 1:
                    bookMenu.insertBook();
                    break;
                case 2:
                    bookMenu.selectList();
                    break;
                case 3:
                    bookMenu.searchBook(bookTitle);
                    break;
                case 4:
                    bookMenu.deleteBook(bookTitle, author);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
