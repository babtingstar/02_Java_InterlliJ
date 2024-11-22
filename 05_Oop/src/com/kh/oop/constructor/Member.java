package com.kh.oop.constructor;

public class Member {

    private String name;
    private int age;
    private String gender;

    // 1. 아무것도 작성되어 있지 않은 기본 생성자
    public Member(){}

    public Member(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void display(){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Gender " + gender);
    }

    //toString 메서드 : 객체 변수명에 저장된 정보를문자열로 전달해서 보여줌
    //자바 자체에 만들어노흔 기능
    @Override // 안붙여도 됨. 누군가가 만든 기능을 재사용 하는 의미로 붙여줌
    public String toString(){
        return "Name " + name + " Age " + age + " Gender " + gender;
    }

}
