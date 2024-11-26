package com.kh.poly.pack3.interfaceEx;

// 클래스, 추상 클래스 상속 키워드 - extends
// 인터페이스 상속 키워드 : implements
public class Computer implements Machine {
    @Override
    public void powerOn() {
        System.out.println("Computer powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("Computer powered off");
    }
}