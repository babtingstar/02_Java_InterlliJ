package com.kh.loop;

public class For문 {

    //일반적인 1차원 for 문
    public void method1(){
        /*
        Java, JavaScript 모두 사용 방법은 동일
        for 문은 반복문을 작성할 때 사용하는 가장 기본적인 방법
        일정한 횟수만큼 코드를 반복 실행하고 싶을 때 사용

        for(초기식; 조건식; 증감식){
        //조건식이 true 일 경우 실해될 코드
        //조건문이 false 가 될 때 까지 반복 실행

        초기식 : 자료형 변수명 = 시작할 숫자, int i = 0 은 array index [0] 로 시작
        조건식 : {} 를 언제까지 실행할 것인지에 대한 조건
        증감식 : 증감하는 값을 일정하게 지정
         */
    }

    //일반적인 2차원 for 문
    public void method2(){
        /*
        2차원 for 문 = 중첩된 반복문(nested loop)
        하나의 반복문 내부에 또다른 반복문을 포함하는구조
        2차원적인 데이터 처리나 중첩된 작업을 진행할 때 사용
        ex)구구단

        for(초기식1; 조건식1; 증감식1;) // 외부 반복문
        {//조건식1이 true 일 때 반복 실행될 코드
         for(초기식2; 조건식2; 증감식2;)// 내부 반복문
            {//조건식2가 true 일때 반복 실행될 코드}
         }
         */

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("["+i+"]"+"["+j+"]");
            }
        }

    }

    //2차원 for 문을 이용한 구구단 출력하기
    public void method3(){
        for (int i = 2; i < 10; i++) { // 구구단은 2단부터 시작해서 초기값 i=2
            System.out.println("=====" + i + "단");
            for (int j = 1; j < 10; j++) { // 곱은 1부터 곱하기 때문에 초기값 j=1
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println(); // i단이 끝날 때 마다 한 줄 공백 처리
        }
        // 2차원 데이터나 조합 계산이 필요할 때 이중 for 문 사용
        // 메모리 이슈가 있어 대체 방법이 가능할 경우 사용을 최소화 할 것
    }


    //향상된 for 문
    public void method4(){
        /*
        향상된 for 문(enhanced for loop)
        자바 5 버전에서부터 도입된 반복문(현재 자바11)

        배열이나 컬렉션과 같은 데이터 집합을 다룰 때 사용
        기존의 for 문 보다 간결하고, 반복문에서 index 처리가 필요하지 않을 때 사용

        for(타입 변수명 : 컬렉션이나 배열){
            // 변수명은 각 요소를 나타냄
        }

        ** 요소 : html 에서는 <태그>내용물</태그>
                  java 에서는 배열이나 컬렉션, 기타 데이터 구조 안에 저장된 개별 데이터
                  ex) int[] numbers = {10, 20, 30, 40}
                      number 의 배열의 요소 : 10, 20, 30, 40;

                      for(int 변수명 : numbers){
                        System.out.println("요소 + " + 변수명); // 각 요소들 출력
                        }
         */

        int[] numbers = {10, 20, 30, 40};
        for(int number : numbers){
            System.out.println(number);
        }
    }

}
