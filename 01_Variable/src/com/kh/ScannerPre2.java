package com.kh;

import java.util.Scanner;

public class ScannerPre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter hobby: ");
        String hobby = sc.next();

        System.out.println("===자기소개===");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("취미 : " + hobby);

    }
}
