package com.kh.example.practice7.model.vo;

import java.util.Arrays;

public class StudentRun {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();

        studentController.StudentController();

        System.out.println("==========학생 정보 출력==========");
        String print = Arrays.toString(studentController.printStudent());
        System.out.println(print);

        System.out.println("==========학생 성적 출력==========");
        System.out.println(Arrays.toString(studentController.avgScore()));

        System.out.println("==========성적 결과 출력==========");
        for (int i = 0; i < studentController.sArr.length; i++) {
            if (studentController.sArr[i].getScore() >= studentController.CUT_LINE) {
                System.out.println("통과");
            } else {
                System.out.println("재시험 대상");
            }
        }


    }




}
