package com.kh.loop;

public class LoopRun {
    public static void main(String[] args) {
        LoopEx l1 = new LoopEx();
        LoopEx2 l2 = new LoopEx2();
//        l1.method1();
//        l1.method2();
//        l1.method3();
//        l1.method4();
//        l2.while1();
//        l2.while2();
//        l2.while3();


    }

    public void abc() {
        LoopEx l = new LoopEx();
        l.method1();
    }

    // LoofEx l - new LoofEx();
    // l.method1(); 메서드(기능) 내부에 존재하지 않기 때문에 error 발생
}
