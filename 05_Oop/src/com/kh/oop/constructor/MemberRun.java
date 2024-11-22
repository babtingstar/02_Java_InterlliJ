package com.kh.oop.constructor;

public class MemberRun {
    public static void main(String[] args) {

        // m1의 방법은 각각에 특정 조건이 걸려 있거나, 암호화 설정과 같은 특수 기능을 작성해 준 후 넣어줄 때 사용
        Member m1 = new Member();
        m1.setName("홍길동");
        m1.setAge(40);
        m1.setGender("여성");

        // m2의 방법은 특정한 기능을 설정하지 않고, 모두 한 번에 값을 저장할 때 사용
        Member m2 = new Member("감길자", 50, "남성");

        // m1과 m2에 작성한 값들이 저장되어 있는 지 확인
        System.out.println("***** m1의 정보 *****");
        System.out.println(m1.getName());
        System.out.println(m1.getAge());
        System.out.println(m1.getGender());

        System.out.println("***** m2의 정보 *****");
        System.out.println(m2.getName());
        System.out.println(m2.getAge());
        System.out.println(m2.getGender());

        System.out.println("***** toString() 사용 *****");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        //toString 은 자체적인 출력 기능 x
    }
}
