package com.kh.oop.OopEx;

import lombok.Setter;

public class PeopleRun {
    public static void main(String[] args) {

        People p = new People("홍길동", 800101, 23467890);
        System.out.println(p.toString());
        People p2 = new People("강길자", 500101, 98765432);
        p2.setSpeciality("코딩");
        p2.setHobby("음악듣기");
        System.out.println(p2.toString());
    }
}
