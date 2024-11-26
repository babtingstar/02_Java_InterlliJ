package com.kh.CollectionEx.pack1.listEx;

import java.util.Scanner;

public class BookRun {
    public static void main(String[] args) {
        Book_Service bookService = new Book_Service();
//        bookService.method1();
//        bookService.method2();
        Scanner scanner = new Scanner(System.in); // html 연결하면 더 이상 사용 x
        while (true) {
            System.out.println("\n === 책 매니저 === ");
            System.out.println("1. 책 추가하기");
            System.out.println("2. 책 제거하기");
            System.out.println("3. 모든 책 리스트 확인하기");
            System.out.println("4. 종료");
            System.out.print("번호만 입력하세요 : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 제거

            switch (choice) {
                case 1:
                    System.out.print("책 제목을 입력하세요 : ");
                    String title = scanner.nextLine();
                    System.out.print("저자를 입력하세요 : ");
                    String author = scanner.nextLine();
                    System.out.print("팔고자 하는 가격을 입력하세요 : ");
                    String price = scanner.nextLine();
                    scanner.nextLine();
                    break;

                case 2:
                    System.out.print("지우려는 책의 제목을 입력하세요 : ");
                    String removeTitle = scanner.nextLine();

                    // 책 제목이 존재한다면 책을 삭제했습니다
                    // 책 제목이 없다면 책 제목을 찾을 수 없습니다.

                    break;

                case 3:

                    //챌 리스트를 모두 보는 곳
                    //책이 하나도 없다면 판매할 수 있는 책 리스트가 없습니다.
                    //책이 존재한다면 책 리스트 보여주기
                    break;

                case 4:
                    System.out.println("책 매니저를 종료합니다.");
                    return;

                default:
                    System.out.println("잘못 입력했습니다.");
            }
        }
    }
}
