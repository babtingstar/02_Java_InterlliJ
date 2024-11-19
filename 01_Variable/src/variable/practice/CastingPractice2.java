package variable.practice;

import java.util.Scanner;

public class CastingPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        double kor = sc.nextFloat();
        System.out.print("영어 : ");
        double eng = sc.nextFloat();
        System.out.print("수학 : ");
        double math = sc.nextFloat();

        double total = kor + eng + math;
        int int_Total = (int) total;
        int average = int_Total / 3;

        System.out.print("총점 : " + int_Total + "\n평균 : " + average);
    }
}
