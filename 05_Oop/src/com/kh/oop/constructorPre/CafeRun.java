package com.kh.oop.constructorPre;

import java.util.Scanner;

public class CafeRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cafe cafe = new Cafe();

        System.out.print("주문 입력 : ");
        cafe.setName(sc.nextLine());

        System.out.print("가격 입력 : ");
        cafe.setPrice(sc.nextInt());

        System.out.print("수량 입력 : ");
        cafe.setQuantity(sc.nextInt());

        System.out.println((cafe.toString()) + "\n" + (cafe.totalPrice()) + "원");

    }

}
