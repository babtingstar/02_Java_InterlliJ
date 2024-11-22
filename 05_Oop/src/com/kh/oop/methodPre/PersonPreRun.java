package com.kh.oop.methodPre;

import java.util.Scanner;

public class PersonPreRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonPre person = new PersonPre();
        boolean nameFlag = true;
        boolean ageFlag = true;

        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // nextLine()으로 받고 int 로 형변환
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (name.isBlank()) { // if(name.trim.length() == 0) isEmpty()는 공백문자 입력시에 true;
            System.out.println("Name is null");
            nameFlag = false;
        } else {
            person.setName(name);
        }

        if (age <= 0){
            System.out.println("Age is negative");
            ageFlag = false;
        }else {
            person.setAge(age);
        }
//        else if(age == null){ //  나이 비입력시 - 초기화를 음수 또는 0로 하고, age<=0 로 넘어가나?
//        }
        System.out.println(nameFlag);
        System.out.println(ageFlag);
        if(nameFlag && ageFlag){
            System.out.println("name : " + person.getName() + "\n age : " + person.getAge());
        }else {
            System.out.println("error");
        }

    }
}
