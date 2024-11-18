package com.kh;
/*
 * import java.util.Scanner;
 * import = 외부 폴더나 내부 폴더에서 특정 파일을 가져오기
 * import 폴더명1.폴더명2.파일명;
 * 다른 파일에서 특정 파일을 가져와 사용할 때는 파일명 맨 앞글자가 영어 대문자인지 확인하기
 * 파일 이름을 소문자로 모두 작성한 경우 외부에서 파일 가져오기 X
 *
 * 자바 자체에서 제공하는 파일 이름과 같은 파일 이름 만들지 말 것
 * */

import java.util.Scanner;


public class ScannerPre1 {
    public static void main(String[] args) {
        // 외부에서 가져온 파일명 작성
        // 자료형 변수명 = 새로운 스캐너 시작(프로그램 내에서 작성한 값 읽기 모드);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number1 : ");
        int number1 = sc.nextInt(); // 정수 1번 입력
        /*
         * 매번 new Scanner(System.in)을 작성하기 번거롭기 때문에
         * 맨 위에 sc 라는 변수명으로 선언하고
         * 시스템 안에다가 스캔해서 전달한다는 기능을 sc라는 이름으로 줄여서 사용한다 한 것
         *
         * int 의 경우 nextInt
         * double 의 경우 nextDouble
         * float 의 경우 nextFloat
         * String 의 경우 byte 가 몇 byte 인지 측정할 수 없기 때문에 next()만 작성
         */


        System.out.println("Enter a number2 : ");
        int number2 = sc.nextInt(); // 정수 2번 입력

        System.out.println("Enter a number3(float) : ");
        float number3 = sc.nextFloat(); // 실수 3번 입력

        System.out.println("이름을 입력하세요 : ");
        String name = sc.next(); // 이름 입력

        System.out.println("number1 : " + number1 + "\nnumber2 : " + number2 + "\nnumber3 : " + number3 + "\nname : " + name);

        // ctrl + alt + l 자동정렬
    }
}
