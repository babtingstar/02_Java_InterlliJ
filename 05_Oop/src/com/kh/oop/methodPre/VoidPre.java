package com.kh.oop.methodPre;

public class VoidPre {
    // 1. 온도 변화 확인하기
    public void method1(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        // 출력 : 섭씨 25도는 화씨 77.0 도 입니다.
        System.out.println("섭씨 " + celsius + "도는 화씨 " + fahrenheit + "도 입니다.");
    }

    public void method2(String name) {
        System.out.println(name);
    }

    public void method3(String name, int price) {
        System.out.println("상품명 : " + name + ", 가격 : " + price + "원");
    }

    public void method4(int hours, int minutes) {
        System.out.println("총 " + (hours*60 + minutes) + "분 입니다.");
    }

    public void method5(String work, int duration) {
        System.out.println("운동 : " + work + ", 지속 시간 : " + duration + " 분");
    }

    public void method6(String accountNumber, double amount) {
        System.out.println("계좌번호 : " + accountNumber + ", 잔액 : " + amount + "원");
    }

    public void method7(String movie, double rating) {
        System.out.println("영화 제목 : " + movie + ", 평점 : " + rating + "/10");
    }

    public void method8(String carName, int maxSpeed) {
        System.out.println("차랑명 : " + carName + ", 최고 속도 : " + maxSpeed + "/h");
    }

    public void method9(String eAddress, String title) {
        System.out.println("수신자 : " + eAddress + ", 제목 : " + title);
    }

    public void method10(String itemName, int quantity) {
        System.out.println("상품명 : " + itemName + ", 수량 : " + quantity + "개");

    }
}
