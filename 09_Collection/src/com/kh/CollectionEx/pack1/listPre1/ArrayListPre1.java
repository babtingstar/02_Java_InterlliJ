package com.kh.CollectionEx.pack1.listPre1;

import java.util.ArrayList;

public class ArrayListPre1 {
    public void method1(){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("새우깡");
        list1.add("맛동산");
        list1.add("포카칩");
        list1.add("고구마칩");
        list1.add("고래밥");

        System.out.println(list1);
        System.out.println(list1.size()); // size = 5

        list1.add(1, "맛동산을_쿠앤크로"); //
        System.out.println(list1);

        System.out.println("인덱스 3의 값 : " + list1.get(3));
        list1.remove(0);
        System.out.println(list1);

        list1.remove("맛동산을_쿠앤크로");
        System.out.println(list1);

        list1.remove("맛동산");
        System.out.println(list1);
        System.out.println(list1.size()); // size = 3

        System.out.println("contains? : " + list1.contains("포카칩"));
        System.out.println("contains? : " + list1.contains(3));
        System.out.println("contains? : " + list1.contains(4));

        list1.clear();
        System.out.println(list1);
        System.out.println(list1.size());
    }

    public void method2(){
        ArrayList<String> list2 = new ArrayList<String>(); // ArrayList 생성

        list2.add("포도");
        list2.add("바나나");
        list2.add("망고"); // 과일 저장

        list2.add(1, "파인애플"); // 바나나 파인애플 변경
        list2.remove(0); // 첫 번째 과일 삭제
        list2.remove("망고"); // 망고 삭제

        if(list2.contains("사과")){ // 리스트에 사과가 남아있으면
            list2.remove("사과");
            System.out.println(list2); // 출력
        }else {
            System.out.println(list2); // 출력
        }

        list2.clear(); // 클리어
        System.out.println(list2); // 결과출력
    }

    public void method3(){
        // 정수타입 제한
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(200);
        intList.add(300);
        System.out.println("intList : " + intList);

        // 문자타입 제한
        ArrayList<Character> charList = new ArrayList<Character>();
        charList.add('a');
        charList.add('가');
        charList.add('b');
        charList.add('나');
        System.out.println("charList : " + charList);

        // 논리타입 제한
        ArrayList<Boolean> boolList = new ArrayList<Boolean>();
        boolList.add(true);
        boolList.add(false);
        System.out.println("boolList : " + boolList);

        // 실수타입 제한
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(1.5);
        doubleList.add(3.14);
        System.out.println("doubleList : " + doubleList);
    }


}
