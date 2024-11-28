package com.kh.example.practice7.model.vo;

public class StudentRun {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();

        studentController.StudentController();

        System.out.println("==========학생 정보 출력==========");
        studentController.printStudent();

        System.out.println("==========학생 성적 출력==========");
        studentController.sumScore();
        studentController.avgScore();

        System.out.println("==========성적 결과 출력==========");
        if(sm[i].getScore() >= CUT_LINE) {
            System.out.println("통과");
        }else {
            System.out.println("재시험 대상");
        }


    }




}
