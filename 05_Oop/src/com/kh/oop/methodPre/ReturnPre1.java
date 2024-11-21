package com.kh.oop.methodPre;

public class ReturnPre1 {

    public String name = "홍길동";
    public int phone = 1234;
    public String id = "dongdong1004";

    public String findId(String a, int b) {

//        if (name.equals(a)) { // String 은 참고형이라 equals 사용
//            return id;
//        } else {
//            return "아이디를 찾을 수 없습니다.";
//        }
//
//        if (phone == b){
//            return id;
//        } else{
//            return "아이디를 찾을 수 없습니다.";
//        }
        if (name.equals(a) && phone == b) {
            return id;
        }
        return "아이디를 찾을 수 없습니다.";
    }

    //계산기

    public double add(double a, double b){
        return a + b;
    }
    public double sub(double a, double b){
        return a - b;
    }
    public double mul(double a, double b){
        return a * b;
    }
    public double div(double a, double b){
        return a / b;
    }
}
