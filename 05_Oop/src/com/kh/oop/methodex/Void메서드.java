package com.kh.oop.methodex;

public class Void메서드 {

    // 1. 매개변수 x, Return x 기능만을 실행
    public void method1(){
        System.out.println("안녕하세요");
    }

    // 2. 매개변수가 존재하는 void 메서드
    //                          ┌> 매개변수명, method2 지역변수
    public void method2(String userId){
        System.out.println("안녕하세요, " + userId + "님");
    }

    public void method3(int param){
        System.out.println(param + " 세 입니다.");
    }

    // 자료형과 매개변수가 두 개 이상 들어가는 메서드
    public void method4(String name, int age){
        System.out.println(name + "님의 나이는 " + age + "세 이군요.");
    }

    public void login(String id, String pw){
        System.out.println( "아이디는 "+id+"입니다.");
        System.out.println("비밀번호는 "+pw+"입니다.");
    }

    public void findId(String name, String emali){
        System.out.println("아이디는 kht 입니다.");
    }
}
