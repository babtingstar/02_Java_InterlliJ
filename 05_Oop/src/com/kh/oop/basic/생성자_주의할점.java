package com.kh.oop.basic;

public class 생성자_주의할점 {

    private String a;
    private String b;
    private int c;
    private int d;
    private char e;


    // 1. 매개변수가 없는 기본 생성자
    public 생성자_주의할점(){}

    // 2. 매개변수가 모두 있는 생성자
    public 생성자_주의할점(String a, String b, int c, int d, char e) {}

    // 3. 매개변수를 원하는 변수의 값만 가져올 수 있도록 설정
    public 생성자_주의할점(int c, int d){
        this.c = c;
        this.d = d;
    }

    public 생성자_주의할점(String a, int c){
        this.a = a;
        this.c = c;
    }

//    public 생성자_주의할점(String b, int d) {
//    }
}
