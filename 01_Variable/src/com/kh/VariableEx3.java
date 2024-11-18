package com.kh;

public class VariableEx3 {
    public static void main(String[] args) {
        /* ***** 강제 형변환 *****
         * 1. 값의 데이터가 큰 자료형 → 작은 자료형으로 강제적 변환 (데이터 손실 고려)
         *
         * 2. 의도적으로 자료형을 다른 자료형으로 변환시킬 때
         *
         * [작성법]
         *
         * (자료형) 변수면 || 값; // 지정된 자료형으로 변경됨
         */

         // 강제 형변환 확인 1
        // → 자료형 변환 + 데이터 손실

        int num1 = 290;

        // byte -128 ~ 127, 여기에 290을 강제로 넣을 예정
        byte result1 = (byte)num1; // int → byte 큰 값을 작은값으로 강제 형변환

        System.out.println(num1); // 290
        System.out.println(result1); // 34 -128 ~ 0 ~ 127 + 34
        
        
        // 강제 형변환을 진행할 대는 리터럴숫자 앞에 큰 → 작은 것으로 변할 자료형을 () 이용해서 표기

        // 숫자 맨 앞에 0이 붙어있을 경우
        int 주민번호1 = 870101;
        System.out.println("주민등록번호 1번 : " + 주민번호1);

        int 주민번호2 = 000101;
        System.out.println("주민등록번호 2번 : " + 주민번호2);

        // 숫자 맵 앞에 0이 붙으면 0을 제외한 수만 표기되거나, 10진수 → 8진수로 변환
        // 숫자 표현에 문제가 생길 수 있기 때문에 나이를 제외하고 보통 String을 사용
        String 주민번호3 = "000101";
        System.out.println(("주민등록번호 3번 : " + 주민번호3));

    }
}