package com.kh.loof;

import java.util.Scanner;

public class LoofEx2 {
    Scanner sc = new Scanner(System.in);

    /*
    while 문을 이용해서 while 문이 false 가 될 때까지 계속 실행

    반복문의 한 종ㅇ류
    특정 조건인 참(true)인 동안 계속해서 코드를 실행
    특정 조건이 거짓(false)인 경우 반복을 종료
    while(조건식)
    {조건식이 true 일 때 실행되는 코드}
    */
    public void while1() {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

    }

    public void while2() {
        boolean xyz = true;
        while (xyz) {
            System.out.println("현재값 xyz = " + xyz);
            System.out.println("xyz의 값을 false로 변경하려면 'no'를 입려하세요.");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("no")) { // 대소문자를 구별하지 않고 문자열을 구분
                xyz = false;
            }
        }
    }

    public void while3() {
        System.out.println("===0이되면 종료되는 세상===");
        //초기값이 0이 아닌 아무 숫자
        int input = -1;

        while (input != 0) {
            System.out.print("숫자를 입력하세요 (0을 입력하면 종료) : ");
            input = sc.nextInt();
            System.out.println("입력된 숫자 : " + input);
        }

        System.out.println("프로그램을 종료합니다.");
    }
    
    public void while4() {
        System.out.println("===음수가 되면 종료되는 세상===");
        //초기값이 0이 아닌 아무 숫자
        int input = 0;

        while (input >= 0) {
            System.out.print("숫자를 입력하세요 (음수를 입력하면 종료) : ");
            input = sc.nextInt();
            System.out.println("입력된 숫자 : " + input);
        }

        System.out.println("프로그램을 종료합니다.");
    }

}
