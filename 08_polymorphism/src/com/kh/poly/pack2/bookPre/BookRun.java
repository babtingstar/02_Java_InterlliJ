package com.kh.poly.pack2.bookPre;

public class BookRun {
    public static void main(String[] args) {
        Book ebook = new EBook("자바 프로그래밍", "홍길동", 20000, "15.5MB");
        Book pbook = new PrintBook("파이썬 입문", "이영희", 10000, 3000);

        System.out.println(ebook.toString());
        System.out.println(pbook.toString());

    }


}
