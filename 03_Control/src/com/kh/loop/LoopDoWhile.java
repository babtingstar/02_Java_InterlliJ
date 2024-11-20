package com.kh.loop;

import java.util.Scanner;

public class LoopDoWhile {
    /*
    do-while 문
    - 조건식이 뒤에 작성된 while 문
    - 무조건 최소 1회 이상의 반복을 보장
     */

    /*
    메소드(=method)
    method1() 기능은
    do-while을 이용해서 0이 입력될 때까지 정수를 계속 입력 받고
    0 입력시 누적된 합계 출력
     */
    Scanner sc = new Scanner(System.in);

    public void method1(){
        int sum = 0;
        int input;

        do { // while 문을 시작하기 전에 한 번 무조건 실행하는공간, 입력한 값이 0이 아닐때만 반복
        System.out.println("정수 입력 : ");
        input = sc.nextInt();
        sum += input;
        }while(input != 0);
        System.out.print("합계 : " +sum);
    }
}
