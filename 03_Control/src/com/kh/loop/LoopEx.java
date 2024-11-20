package com.kh.loop;

import java.util.Scanner;

public class LoopEx {
    // 필드 = 변수명

    // 앞으로 만드는 public void 기능명(method){}
    // public static void main(String[] args){}
    //내부에서 sc를 사요할 수 있음
    //한 파일당 하나씩, 외부 파일에서 변수를 사요할 때는 새로 선언해서 사용(Scanner sc = new Scanner())

    Scanner sc = new Scanner(System.in);

    public void method1() {
        System.out.println("숫자를 입력하세요");
        int a = sc.nextInt();
        System.out.println("a값 확인하기 : " + a);

        for (int i = 1; i <= a; i++) {
            System.out.println("i의 값 : " + i);
        }
    }

    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 값 입력 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 값 입력 : ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("첫 번째 값보다 두 번째 값보다 작아야 합니다.");
            return;
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("두 값이 동일합니다.");
        }

    }

    public void method3() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public void method4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int b = sc.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("같은 수 입력됨.");
        }
    }
}
