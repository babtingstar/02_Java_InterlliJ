package com.kh.practice.condition;

import java.util.Scanner;

public class Practice1 {
    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 메뉴 ===");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("7. 종료");
        System.out.print("메뉴 번호를 입력하세요 : ");

        int choice = sc.nextInt();
        String result;
        switch (choice) {
            case 1:
                result = "입력";
                break;
            case 2:
                result = "수정 메뉴입니다";
                break;
            case 3:
                result = "조회 메뉴입니다";
                break;
            case 4:
                result = "삭제 메뉴입니다";
                break;
            case 7:
                result = "종료";
                break;
            default:
                result = "옳바른 메뉴 번호를 입력해주세요";
                break;
        }
        System.out.println(result);

    }

    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해 주세요 : ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("음수입니다.");
            return;
        }
        int even = number % 2;
        if (even == 0) {
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수입니다.");
        }
    }

    public void method3() {
        Scanner sc = new Scanner(System.in);
        String userId = "myId";
        String userPw = "myPassword12";

        System.out.print("아이디를 입력해주세요 : ");
        String inputId = sc.next();
        System.out.print("비밀번호를 입력해주세요 : ");
        String inputPw = sc.next();

        boolean loginId = inputId.equals(userId);
        boolean loginPw = inputPw.equals(userPw);

        if (!loginId) {
            System.out.println("아이디가 틀렸습니다.");
            return;
        }
        if (!loginPw) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        System.out.println("로그인 성공");

    }
}
