package com.kh.practice;

import java.util.Scanner;

public class ArrayPre1 {
    Scanner sc = new Scanner(System.in);

    public void practice3() {
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        if (!(n > 0)) {
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
            System.out.print("practice 3 - arr[" + i + "] = " + arr[i] + "\n");
        }
    }

    public void practice4() {
        String fruits[] = {"사과", "귤", "포도", "복숭아", "참외"};
        System.out.println("배열 0에서 출력한 값 " + fruits[0]);
        System.out.println("배열 1에서 출력한 값 " + fruits[1]);
        System.out.println("배열 2에서 출력한 값 " + fruits[2]);
        System.out.println("배열 3에서 출력한 값 " + fruits[3]);
        System.out.println("배열 4에서 출력한 값 " + fruits[4]);
    }

    public void practice6() {
        char arr[] = new char[14]; // 123456-1234567
        System.out.println("주민등록번호 입력");

        for (int i = 0; i < arr.length; i++) {
            if (i < 7) {
                arr[i] = sc.next().charAt(0);
            }
            if (i >= 7) {
                arr[i] = '*';
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void practice6a() {
        System.out.println("전화번호를 입력하세요 : ");
        String inputPh = sc.next();
        char[] savePh = new char[17]; //+82-010-1234-5678
        for (int i = 0; i < inputPh.length(); i++) {
            savePh[i] = inputPh.charAt(i);
        }
        for (int i = 0; i < savePh.length; i++) {
            if (i < 8) {
                System.out.print(savePh[i]);
            } else {
                System.out.print("*");
            }
        }
    }

    public void practice6b() {
       String countryCode = "+82-";

       System.out.print("전화번호(-포함");
       String input = sc.next();

       String fullNumber = countryCode + input;

       char[] arr = new char[fullNumber.length()];




    }


}
