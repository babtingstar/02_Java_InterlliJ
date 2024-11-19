package com.kh.practice.condition;

import java.util.Scanner;

public class ConditionPre {
    public void methodeAge() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        switch (age / 10) {
            case 0:
            case 1:
                System.out.println("어린이");
                break;

            case 2:
                if (age <= 18) {
                    System.out.println("청소년");
                    break;
                } else {
                    System.out.println("성인");
                    break;
                }
            default:
                System.out.println("잘못 입력");
                break;
        }

    }
}
