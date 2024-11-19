package com.kh.condition;

import java.util.Scanner;

//조건문 기능용 클래스
public class ConditionEx {
    // main()이 없기 때문에 실행이 안됨
    public void 나이확인() {
        Scanner sc = new Scanner(System.in);

        System.out.println("*****나이 확인하기******");

        int age = 20;

        if (age < 18) {
            System.out.println("성인이 아닙니다. ");
        } else {
            System.out.println("성인입니다.");
        }
    }

    public void scannerAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("성인인지 나이로 판단하기");
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();

        // 입력받은 나이가 19세 이상이라면
        if (age >= 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("성인이 아닙니다.");
        }
    }


    /*
    나이를 입력받아
    13세 이하면 어린이입니다
     13세 초과 18세 이하는 청소년입니다
    18세 초과면 성인입니다.
    */
    //method = 기능
    public void methodAage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("***세분화된 나이 판단기능***");
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();

        if (age <= 18) {
            System.out.println("어린이입니다.");
        } else if (age < 18) {
            System.out.println("청소년입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }

    public void methodMonth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("계절 확인이 필요한 달(월)을 입력하세요");
        System.out.println("숫자만 입력이 가능합니다");
        System.out.print("계절 확인이 필요한 달(월) 입력하기 : ");
        int month = sc.nextInt();
        String season;

        if (!(month >= 1 && month <= 12)) {
            System.out.println("1 ~ 12 월 까지만 가능합니다.");
            return; // methodMonth()를 종료하고 호출한곳으로 돌아감
        }
        if (month >= 3 && month <= 5) {
            //System.out.println("봄");
            season = "봄";
        } else if (month >= 6 && month <= 8) {
            //System.out.println("여름");
            season = "여름";
        }
        if (month >= 9 && month <= 11) {
            //System.out.println("가을");
            season = "가을";
        } else {
            //System.out.println("겨울");
            season = "겨울";
        }

        System.out.println(month + "는 " + season + "입니다.");
    }

    public void changeMonth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("달(월) 입력 : ");
        int month = sc.nextInt();

        String season;

        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
                default:
                    season = "잘못 입력";
                    break;
        }
        System.out.println(month + "월은" + season + " 입니다.");
    }


}
