package com.kh.example.practice7.model.vo;

public class StudentController {
    Student[] sArr = new Student[5];
    public static int CUT_LINE = 60;

    public void StudentController() {
        Student sm1 = new Student("김길동", "자바", 100);
        sArr[0] = sm1;
        Student sm2 = new Student("박길동", "디비", 50);
        sArr[1] = sm2;
        Student sm3 = new Student("이길동", "화면", 85);
        sArr[2] = sm3;
        Student sm4 = new Student("정길동", "서버", 60);
        sArr[3] = sm4;
        Student sm5 = new Student("홍길동", "자바", 20);
        sArr[4] = sm5;
    };

    public Student[] printStudent() {
        return sArr;
    }

    public int sumScore(){
        int sum = 0;
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != null) {
                sum += sArr[i].getScore();
            }
        }
        return sum;
    }

    public double[] avgScore(){
        double[] avgScore = new double[2];
        avgScore[0] = sumScore();
        avgScore[1] = avgScore[0]/sArr.length;
        return avgScore;
        }
    }

