package com.kh.practice.func;
//연산자 실습문제1
//Scanner sc = new Scanner(System.in);
//        System.out.print("정수 : ");
//        int num = sc.nextInt();

import java.util.Scanner;

public class funcOperatorPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("양수다.");
        } else {
            System.out.println("양수가 아니다.");
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("양수다.");
        } else if (num < 0) {
            System.out.println("음수다.");
        } else {
            System.out.println("0 이다.");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();
        if (num <= 0) {
            return;
        }
        if (num % 2 == 0) {
            System.out.println("짝수다");
        } else {
            System.out.println("홀수다");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원 수 : ");
        int manCount = sc.nextInt();
        System.out.print("사탕 개수 : ");
        int candyCount = sc.nextInt();

        System.out.println("1인당 사탕 개수 : " + candyCount / manCount);
        System.out.println("남는 사탕 개수 : " + candyCount % manCount);

    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String inputName = sc.next();
        System.out.print("학년(숫자만) : ");
        int inputGrade = sc.nextInt();
        System.out.print("반(숫자만) : ");
        int inputClass = sc.nextInt();
        System.out.print("번호(숫자만) : ");
        int inputNumber = sc.nextInt();
        System.out.print("성별(M/F) : ");
        char inputGender = sc.next().charAt(0);
        System.out.print("성적(소수점 아래 둘째자리까지: ");
        double inputScore = sc.nextDouble();


        String resultGender;
        if (inputGender == 'M') {
            resultGender = "남학생";
        } else {
            resultGender = "여학생";
        }


        System.out.println(inputGrade + "학년 "
                + inputClass + "반 "
                + inputNumber + "번 "
                + inputName + " "
                + resultGender + "의 성적은 "
                + inputScore + "이다.");

    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 : ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("잘못 입력");
        } else if (num <= 13) {
            System.out.println("어린이");
        } else if (num <= 19) {
            System.out.println("청소년");
        } else {
            System.out.println("성인");
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        int kor = sc.nextInt();
        System.out.print("영어 : ");
        int eng = sc.nextInt();
        System.out.print("수학 : ");
        int mat = sc.nextInt();

        int total = kor + eng + mat;
        double average = total / 3.0;
        System.out.println("합계 : " + total);
        System.out.println("평균 : " + average);

        if (kor >= 40 && eng >= 40 && mat >= 40) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요(- 포함) : ");
        char gender = sc.next().charAt(7);
        if (gender == '1' || gender == '3') {
            System.out.println("남자");
        } else if (gender == '2' || gender == '4') {
            System.out.println("여자");
        }
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수1 : ");
        int num1 = sc.nextInt();
        System.out.print("정수2 : ");
        int num2 = sc.nextInt();
        System.out.print("입력 : ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            return;
        }
        if (num3 <= num1 || num3 > num2) {
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }

    public void practice10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 1 : ");
        int num1 = sc.nextInt();
        System.out.print("입력 2 : ");
        int num2 = sc.nextInt();
        System.out.print("입력 3 : ");
        int num3 = sc.nextInt();

        boolean flag = (num1 == num2 && num2 == num3);
        System.out.println(flag);
    }

    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("A 사원의 연봉 : ");
        int num1 = sc.nextInt();
        System.out.print("B 사원의 연봉 : ");
        int num2 = sc.nextInt();
        System.out.print("C 사원의 연봉 : ");
        int num3 = sc.nextInt();

        double num1_in = num1*(1+0.4);
        double num2_in = num2*(1+0);
        double num3_in = num3*(1+0.15);

        String str_num1_in;
        String str_num2_in;
        String str_num3_in;

        if(num1_in>= 3000){
            str_num1_in = "3000 이상";
        } else {
            str_num1_in = "3000 미만";
        }
        if(num2_in>= 3000){
            str_num2_in = "3000 이상";
        } else {
            str_num2_in = "3000 미만";
        }
        if(num3_in>= 3000){
            str_num3_in = "3000 이상";
        } else {
            str_num3_in = "3000 미만";
        }



        System.out.print("A사원 연봉 / 연봉+a : " +num1+"/"+num1_in+"\n"+str_num1_in);
        System.out.print("B사원 연봉 / 연봉+a : " +num2+"/"+num2_in+"\n"+str_num2_in);
        System.out.print("C사원 연봉 / 연봉+a : " +num1+"/"+num3_in+"\n"+str_num3_in);


    }
}
