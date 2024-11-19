package variable.practice;

import java.util.Scanner;

public class CastingPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 : ");
        char ch = sc.next().charAt(0);
        // System.out.println((int) ch);
        int chnum = (int)ch;
        System.out.println(ch + " unicode : " + chnum);

        sc.close(); // 스캐너 사용이 끝나면 닫기

    }

}
