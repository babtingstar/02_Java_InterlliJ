package com.kh.poly.pack3.interfaceEx;

public abstract class Animal {
    private String type;


    /*
    Animal 클래스를 상속받는 자식 클래스가 각자에게 맞춰 재정의(Overriding) 하도록 강제 시킴
     */

    public abstract void eat();
    public abstract void sleep();
}
