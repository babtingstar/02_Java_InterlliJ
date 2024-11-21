package com.kh.oop.methodPre;

public class ReturnRun1 {
    public static void main(String[] args) {
        ReturnPre1 r1 = new ReturnPre1();
//        System.out.println(r1.findId("감길식", 5678));
//        System.out.println(r1.findId("홍길동", 1234));

        int x = 3;
        int y = 5;

        r1.add(1, 2);
        r1.sub(1, 2);
        r1.mul(1, 2);
        r1.div(2, 1);

        System.out.println(r1.add(x, y));
        System.out.println(r1.sub(x, y));
        System.out.println(r1.mul(x, y));
        System.out.println(r1.div(x, y));
    }
}
