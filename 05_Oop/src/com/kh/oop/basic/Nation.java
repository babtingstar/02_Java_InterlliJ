package com.kh.oop.basic;

/*
 *클래스 : 객체가 가져야 할 속성(값), 기능(메서드)를 글(코드)로 작성해둔 문서(설계도)
 */


public class Nation {

    // 필드 = 속성(값)

    String name;
    int age;
    char gender;

    // 주민번호부터 주소까지 사용되지 않았음, 자바에서 garbage collection 으로 알아서 메모리에서 정리됨
    String SocialNumber;
    String tel;
    String address;

    // 기능 = 메서드 = 행동
    public void speak() {
        System.out.println("가나다라 한국어 가능합니다.");
    }

    public void 납세의의무() {
        //만 19세 이상 성인만 세금을 내는 경우
        if (age >= 19) {
            System.out.println(name + "님은 세금 납부 대상자입니다.");
        } else {
            System.out.println(name + "님은 " + age + "세, 미성년자로 납부 대상자가 아닙니다.");
        }
    }

    public void introduce() {
        System.out.println("이름은 " + name + "이고, " + age + "세, " + gender + "성 입니다. ");
    }
}
