package com.kh.poly.pack3.interfaceEx;

// Animal 을 상속받는 Snake eat()과 sleep()의 기능을 구현해야함
public class Snake extends Animal {

    private int poison;


    // Animal 클래스에서 완성되지 않은 기능을 재정의
    @Override
    public void eat() {
        System.out.println("뱀은 한 번에 삼켜서 천천히 소환시킴");
    }

    @Override
    public void sleep() {

    }
}
