package com.kh.oop.OopEx;

public class BreadRun {
    public static void main(String[] args) {
        Bread b1 = new Bread();
        b1.setBreadName("소금빵");
        Bread b2 = new Bread("초코소라빵", 1500, 2);

        System.out.println(b1.getBreadName());
        System.out.println(b1.toString());
        System.out.println(b2.toString());

        //int 정수형에 아무값도 들어가지 않으면 기본값은 0
        //String 문자열에 아무값도 들어가지 않으면 기본값은 null

    }
}
