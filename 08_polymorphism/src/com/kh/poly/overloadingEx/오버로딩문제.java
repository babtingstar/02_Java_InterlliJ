package com.kh.poly.overloadingEx;

public class 오버로딩문제 {

    public void method1(int i) {
    }

    public void method1(String str) {
    }

    public void method1(int i, String str) {
    }

//    public void method1(int num) {
//    }
    public void method1(int num, char a) {
    }

//    public char method1(int point) {
//    }

    public void method1(int i, int k) {
    }

//    public void method1(int num, String string) {
//    }

    public void method1(String str, int i) {
    }

    /*
    오버로딩이 되는 조건
                - 매개변수의 개수가 다르거나
                             종류가 다르거나
                             순서가 다르거나
                   할 때 오버로딩이 적용됨

     매개변수명, 반환 타입은 오버로딩 조건에 상관없음
     */
}
