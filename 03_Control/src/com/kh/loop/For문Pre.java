package com.kh.loop;

public class For문Pre {
    public void method1(){
        String[] fruits = {"사과", "바나나", "체리"};
        // 배열(fruits)의 자료형(String)과 초기문에서 선언하는 변수(fruit)의 자료형(String)이 일치해야함
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }

    public void method2(){
        int[] numbers = {1,2,3,4,5};

        for(int number : numbers){
            System.out.println(number);
        }
    }
}
