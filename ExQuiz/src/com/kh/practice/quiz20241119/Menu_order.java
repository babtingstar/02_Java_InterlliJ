package com.kh.practice.quiz20241119;

import java.util.Scanner;

public class Menu_order {
    public void order() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int input;
        int count = 0;
        System.out.println("===메뉴판===");
        System.out.println("1. 아메리카노 - 3000원");
        System.out.println("2. 라떼 - 4000원");
        System.out.println("3. 카푸치노 - 4500원");
        System.out.println("4. 주문 종료");
        while (flag) {

            System.out.println("\n메뉴를 선택하세요 : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    count += 3000;
                    break;
                case 2:
                    count += 4000;
                    break;
                case 3:
                    count += 4500;
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.print("잘못된 선택입니다. 다시 입력해주세요.");
                    break;
            }
        }
        System.out.println("주문을 종료합니다.");
        System.out.println("총 주문 금액 : " + count + "원");


    }
}
