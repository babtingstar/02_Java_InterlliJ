package kh.com.ex;

import java.util.Scanner;

public class OperatorEx {

    /*
    public static void main(final String[] args){}
    최종으로 출력하는 메인 기능에
    내가 원하는 기능만 묶어서 출력하고자 할 때 작성하는기능

    public void 기능명칭(){}
    각 원하느 기능별로 묶어서 main 기능에서 출력하고자 하는기능만 선택해서 출력
     */

    // 맨 첫 글자는 변수명, 메서드명, 클래스명 모두 다 숫자로 시작x
    public void 삼의배수가맞는지확인하는기능() {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 하나를 입력하세요 : ");
        int a = sc.nextInt();
        /*
         * == (equal to)
         * != (not equal to)
         */

        boolean tf = a%3 == 0;
        System.out.println("입력한 숫자가 3의 배수인가: " + tf);
    }

    public void 이의배수가맞는지확인하는기능(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int a = sc.nextInt();
        // 2의 배수가 맞으면 true 아니면 false
        boolean tf = a%2 == 0;
        System.out.println("2의 배수인가 : " + tf);
    }
}
