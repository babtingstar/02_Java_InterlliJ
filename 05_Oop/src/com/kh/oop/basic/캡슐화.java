package com.kh.oop.basic;

public class 캡슐화 {
    /*
    [캡슐화]
    - 객체의 속성(필드) 직접 접근하는 것을 제한하는 것이 원칙
        : 데이터 훼손 우려

    - 직접 접근을 제한하기 위해서 모든 필드에 private 키워드를 작성
        : private - 현재 객체만 접근 가능함

    - 속성에 직접 접근을 할 수 없으므로, set/get 의 간접 접근 기능을 이용

     */

    private String name;
    private int age;

    // setter 와 getter 설정
    // setter public void set속성변수명(매개변수명){this.name = 매개변수명;}
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
}
