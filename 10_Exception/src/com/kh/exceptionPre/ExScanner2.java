package com.kh.exceptionPre;

import java.util.Scanner;

public class ExScanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("====================");
            System.out.print("닉네임 : ");
            String nickname = sc.nextLine();
            System.out.print("성별 : ");
            char gender = sc.next().charAt(0);
            System.out.print("나이 : ");
            int age = sc.nextInt();

            System.out.println("생성 성공");
            System.out.println("캐릭터 정보 : " + nickname + ", 성별" + gender);
        } catch (Exception e) {
            e.printStackTrace();
            /*
            호출 기능 순서대로 발생한 예외(문제)들을 모두 추적해서 가시화
             */
            System.out.println("creat error");
        } finally {
            sc.close(); // 입력창 종료
            System.out.println("게임을 종료합니다.");
        }


        try{
            int a = 1;
        } catch (Exception e){
            throw new RuntimeException(e);
        } // throw 발생한 예외를 현재 위치에서 보여줌


    }
}
