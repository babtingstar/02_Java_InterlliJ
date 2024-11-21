package com.kh.oop.methodPre;

import java.util.Scanner;

public class ReturnRun3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] accounts = {
                {"user1", "한정일", "19800101"},
                {"user2", "차주식", "19900215"},
                {"user3", "오정희", "20001231"}
        };
        String[] userInput = new String[3];

        System.out.println("ID 찾기");
        System.out.println("이름을 입력하세요 : ");
        userInput[1] = sc.nextLine();
        System.out.println("생년월일을 입력하세요 (YYYYMMDD) : ");
        userInput[2] = sc.nextLine();

        for (String[] account : accounts) {
            if (account[1].equals(userInput[1]) && account[2].equals(userInput[2])) {
                System.out.println("일치하는 아이디는 " + account[0] + "입니다.");
                break;
            } else {
                System.out.println("일치하는 아이디를 찾을 수 없습니다.");
                break;
            }
        }


    }
}
