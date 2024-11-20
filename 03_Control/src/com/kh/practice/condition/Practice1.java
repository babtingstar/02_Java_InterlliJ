package com.kh.practice.condition;

import java.util.Scanner;

public class Practice1 {
    Scanner sc = new Scanner(System.in);

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

    public void method5() {
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

    public void method4() {
        System.out.print("1 ~ 12 사이의 정수 입력 : ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println(month + "월은 겨울입니다.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month + "월은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + "월은 여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + "월은 가을입니다.");
                break;
            default:
                System.out.println(month + "월은 잘못 입력된 달입니다.");
                break;
        }
    }

    public void method10() {
        while (true) {
            System.out.println("실행할 기능을 선택하세요.");
            System.out.println("1. 메뉴 출력");
            System.out.println("2. 짝수/홀수");
            System.out.println("3. 합격/불합격");
            System.out.println("4. 계절");
            System.out.println("5. 로그인");
            System.out.println("6. 권한 확인");
            System.out.println("7. BMI");
            System.out.println("8. 계산기");
            System.out.println("9. P/F");
            System.out.println("0. 종료");
            System.out.print("선택 : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    method1();
                    // 외부에서 기능을 특정적으로 실행하리 않을 때
                    // 내부에서만 기능 불러오기를 진행할 때 기능명칭()만 작성해주면 됨
                    // main()은 class var = new class(); 해야 가능
                    break;
                case 2:
                    method2();
                    break;
                case 5:
                    method5();
                    break;
                case 4:
                    method4();
                    break;
                case 3:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("기능 준비중입니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}
