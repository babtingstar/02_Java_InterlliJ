package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class 학생기능 {
    //학생을 추가하는 addStudent(){} 기능 설정
    // addStudent 기능을 학생기능실행에 불러와서 저장된 학생 출력
    public void addStudent(){
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("학생 학년을 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.print("학생 취미를 입력해주세요 : ");
        String hobby = sc.nextLine();

        학생 s1 = new 학생(name,age,hobby);
        학생 s2 = new 학생("홍길동",10,"공부하기");
        학생 s3 = new 학생("박철수",20,"산책하기");

        ArrayList<학생> std1 = new ArrayList<학생>();
        std1.add(s1);
        std1.add(s2);
        std1.add(s3);

        for(int i=0;i<std1.size();i++){
            System.out.println(std1.get(i));
        }

    }
}
