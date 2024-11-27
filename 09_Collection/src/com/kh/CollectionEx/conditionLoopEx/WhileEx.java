package com.kh.CollectionEx.conditionLoopEx;

public class WhileEx {
    int abc = 1;
    boolean isTrue = true;
    public static void main(String[] args) {
        WhileEx ex = new WhileEx();
        ex.method1();
        ex.method2();

    }

        public void method1() {
            while (isTrue) {
                switch (abc) {
                    case 1:
                        System.out.println("1");
                        break;
                    default:
                        System.out.println("error / isTrue = false");
                        isTrue = false;
                }
            }
        }


        public void method2() {
            while (true) {
                int a = 1;
                switch (a) {
                    case 1:
                        System.out.println("1");
                        break;
                    default:
                        System.out.println("error / return");
                        return;
                }
            }
        }

    /*
    while()은 조건이 참인동안 특정 코드 블록을 반복적으로 실행하는 제어 구조

    while(true){
        repeat;
    }

    반복 횟수가 명확하지 않을 때 사용
    while(false) 라면 내부 코드는 한 번도 실행되지 않기 때문에 문제가 발생
    while(true) 를 기본으로 사용

    while()을 종료하는 방법 : () 내부를 false 로 만들거나 return 처리

    1. () 내부를 false로 만들기
        boolean isTrue = true;
        while(isTrue){
        if(){task1;}
        else {isTure = false;}

    2. return 처리
        while(true){
        if(){task3;}
        else {return;}

     */
}
