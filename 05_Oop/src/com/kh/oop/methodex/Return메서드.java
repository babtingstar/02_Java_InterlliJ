package com.kh.oop.methodex;

public class Return메서드 {
    //public  자료형 메서드명(매개변수이름){
    // 기능 작성
    // return; → 데이터베이스에 저장되어있는 값을 프론트엔드에 전달할 때 주로 사용
    // }

    // 1. 매개변수가 없는 return 메서드
    public String method1() {
        return "안녕하세요!";
    }

    // 2. 매개변수가 있는 return 메서드
    public int method2(int abc) {
        return abc;
    }

    // 3. 매개변수에 있는 자료형과 return 자료형이 다른 메서드

    public /*static*/ String method3(int xyz) {
        return "숫자가 들어왔습니다.";
    }

    // 3 - 1. 아이디찾기

    public int findId(String name, int phone) {
        return 123459789;
    }

    // 4. 매개변수를 활용해서 return 값 가져오기
    public int 더하기(int a, int b) {
        return a + b;
    }

    public int 빼기(int c, int d) {
        int 결과값 = c - d;
        return 결과값;
    }
}
