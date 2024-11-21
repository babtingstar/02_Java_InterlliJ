package com.kh.oop.methodex;

public class Return메서드실행 {
    public static void main(String[] args) {
        Return메서드 rm = new Return메서드();

        rm.method1(); // 출력 결과물 없음
        System.out.println(rm.method1());

        rm.method2(5);
        System.out.println(rm.method2(5));

        int a = rm.method2(5);
        System.out.println(a);

        System.out.println("이름이 박동식, 번호 뒤 4자리가 8857인 사람의 ID 찾기");
        int b = rm.findId("박동식", 8857);
        System.out.println("박동식의 숫자 아이디 : " + b);

        int result1 = rm.더하기(2, 1);
        System.out.println(result1);
        int result2 = rm.빼기(3,1);
        System.out.println(result2);
    }
}
