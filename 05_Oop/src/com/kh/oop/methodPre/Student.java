package com.kh.oop.methodPre;

public class Student {
    // 필드 = 속성 = 멤버변수 (전역변수) - 이름, 나이, 학년, 전공
    private String name;
    private int age;
    private String gender;
    private String major;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }

    public Student(String name, int age, String gender, String major) { // 모든 파라미터값을 가져와서 생성
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
    }

    public Student() {} // 기본 생성자
}
