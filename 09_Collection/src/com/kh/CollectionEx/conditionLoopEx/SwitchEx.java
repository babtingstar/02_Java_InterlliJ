package com.kh.CollectionEx.conditionLoopEx;

import java.util.Scanner;

public class SwitchEx {
    /*
    switch 하나의 변수가 값을 여러 케이스로 나눠 조건에 따라 맞는 기능을 실행
    switch(param){
        case value1 : // if(param == value1)
        break;

        case value2 : // if(param == value2)
        break;

        default : // else
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int abc = 1;

        //switch (abc) {
        switch (num) {
            case 1:
                System.out.println("abc = 1");
                break;
            case 2:
                System.out.println("abc = 2");
                break;
            default:
                System.out.println("abc != 1 && abc != 2");
                break;
        }
    }
}
