package com.kh.oop.constructor;

public class StudentRun {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("홍길동");
        s1.setAge(21);
        s1.setGender("남성");
        s1.setMajor("컴퓨터공학");
        s1.setGpa(3.8);
        s1.setPhoneNumber("010-3245-6789");
        s1.setAddress("서울");
        System.out.println(s1.toString());

        Student s2 = new Student("김영희", 22,"여성", "자바공학", 3.9, "010-8765-4321", "kim_yong@gemil.com", "경기도");
        System.out.println(s2.toString());

        System.out.println("학생 1의 전공은 " + s1.getMajor());
        System.out.println("학생 2의 학점은 " + s2.getGpa());

    }
}
