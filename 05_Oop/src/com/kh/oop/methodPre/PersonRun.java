package com.kh.oop.methodPre;

public class PersonRun {
    public static void main(String[] args) {
        Person p = new Person();

        //Pereson 클래스에서 age라는 변수명에 40이라는 숫자를 넣는 것
        p.setAge(40);

        p.getAge(); // setAge(40)으로 넣은 40이 넣었는지 확인

        System.out.println("저장된 값 : " + p.getAge());

        //나이는 음수 일 수 없다 설정
        int inputAge = -40;
        if(inputAge < 0){
            System.out.println("Invalid Age");
        }else {
            p.setAge(inputAge);
        }

        System.out.println("저장된 값 : " + p.getAge());

        }
}
