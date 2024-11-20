package com.kh.ex;

import java.awt.*;

public class ArrayEx3 {
    public void method1(){
        //int[][] grades = { {}, {} };
    }

    public void method2(){
        /*
        이차원 배열은 배열 안에 배열이 있는 형태로, 배열의 배열
        행(row) 과 열(column) 구성된 데이터 구조
        표나 행렬의 형태로 데이터를 저장할 때 사용

        배열의 차원 :
            - 배열이 몇 개의 차원으로 구성되어 있는지에 따라 다름
            - 1차원 배열은 단순히 값들이 일렬로 나열된 배열
            - 2차원 배열은 여러 개의 1차원 배열이 모여서 하나의 큰 배열을 이루는 구조
        배열의 선언:
        배열 선언 및 초기화 : 타입[][] 배열명 = new 타입[행의개수][열의개수]
                                ex) int[][] arr = new int[3][4] : 3개의 행과 4개의 열을 갖는 2차원 배열
         */
        int[][] grades = {
               //국  영  수  과
                {90, 85, 88, 92}, // 학생 1의 성적
                {78, 82, 79, 85}, // 학생 2의 성적
                {88, 90, 92, 85} // 학생 3의 성적
        }; // 배열 작성 후에 ; 으로 닫기

        System.out.println("=====학생 1의 성적=====");
        System.out.println("학생 1의 국어 성적 : " + grades[0][0]);
        System.out.println("학생 1의 영어 성적 : " + grades[0][1]);
        System.out.println("학생 1의 수학 성적 : " + grades[0][2]);
        System.out.println("학생 1의 과학 성적 : " + grades[0][3]);

        System.out.println("학생 2의 국어 성적 : " + grades[1][0]);
        System.out.println("학생 2의 영어 성적 : " + grades[1][1]);
        System.out.println("학생 2의 수학 성적 : " + grades[1][2]);
        System.out.println("학생 2의 과학 성적 : " + grades[1][3]);

        System.out.println("학생 3의 국어 성적 : " + grades[2][0]);
        System.out.println("학생 3의 영어 성적 : " + grades[2][1]);
        System.out.println("학생 3의 수학 성적 : " + grades[2][2]);
        System.out.println("학생 3의 과학 성적 : " + grades[2][3]);

    }

    public void method3(){
        String[][] fruits = {
                {"사과", "빨강", "단맛", "중간"},
                {"귤", "오렌지", "새콤", "작음"},
                {"포도", "보라", "달콤", "작음"}
        };

        //각 과일의 정보 출력

        System.out.println("과일 1 : " + fruits[0][0] + " ( 색상 : " + fruits[0][1] + ", 맛 : " + fruits[0][2] + ", 크기 : " + fruits[0][3] + ") ");
        System.out.println("과일 2 : " + fruits[1][0] + " ( 색상 : " + fruits[1][1] + ", 맛 : " + fruits[1][2] + ", 크기 : " + fruits[1][3] + ") ");
        System.out.println("과일 3 : " + fruits[2][0] + " ( 색상 : " + fruits[2][1] + ", 맛 : " + fruits[2][2] + ", 크기 : " + fruits[2][3] + ") ");

        // 주의 : 없는 자리에서 값을 가져오려 하면 문제가 발생
        // index 는 무조건 0 부터 순차적으로 자동 번호 매김, 임의 변경 불가능


    }
}
