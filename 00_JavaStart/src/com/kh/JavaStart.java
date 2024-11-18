// 왼쪽에 만든 파일명과 파일 안의 public class 에 적힌 파일명이 다르면
// 빨간색으로 파일명과 클래스 옆에 파일명이 다르다는 에러 발생함
/*public class JavaStart {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}*/

package com.kh;
/*
 * package = 자바 파일이 작성된 폴더들을 나열해 놓은 이름
 * 폴더명을 작성할 경우 .은 폴더 안의 폴더로 들어간다는 의미
 * com을 c.o.m으로 구분지어서 작성 x
 * */
public class JavaStart {

    public static void main(String[] args) {
        // 변수 : 메모리에 값을 저장하기 위한 공간

        // 자료형(data type) : 변수 또는 값의 크기와 형식

        /* ***** 자바 기본 자료형(Java Primitive Type) *****
         * 자바에서 기본으로 제공하는 타입
         *
         * [논리형]
         * boolean(1byte) : true / false - 기본값 false
         *
         * [정수형]
         * byte	(1byte) : 숫자 뒤에 b B
         * short (2byte) : 숫자 뒤에 sh
         * int (4byte) : 정수의 기본 형태, 제일 많이 사용
         * long (8byte) : 숫자 뒤에 l L
         *
         * [실수형]
         * float (4byte) : 숫자 뒤에 f를 붙여줘야 함
         * double (8byte) : 실수 기본 형태
         *
         * [문자형] - 문자
         * char (2byte) : 문자 단일 , ''로 표기
         *
         */

        /* *****기본 자료형이 아닌, 자바에서 제공하는 객체*****
         * [문자열]
         * String - 문자열, 메모리 길이 측정 x
         * 			객체 대신 주소를 저장하기 때문에 참조형으로 불림
         * 			""로 표기
         */

        //변수 선언 : 메모리에 공간을 할당하기 위해 선언
        //보라색으로 바뀌는 단어는 예약어
        boolean 진실_혹은_거짓 = true; // ToF 라는 변수명 1byte true가 저장
        System.out.println("진실_혹은_거짓 =>" + 진실_혹은_거짓);

        double 실수1번; // 메모리에 double 저장 공간 8byte 할당 후, 실수1번으로 명명

        // 값 대입 : 변수에 값을 집어넣는 것, 이미 값이 있는 변수에 대입하면 덮어쓰기 함
        진실_혹은_거짓 = false;

        String 문자열1번 = "만들어진 객체는 예약어처럼 많이 사용";
        String 문자열2번 = "필수로 맨 앞 S는 대문자 표기 보라색으로 글자색 변환";
        System.out.println("변수명에 노란색 밑줄은 변수명을 선언하고" + "아래에서 사용하지 않은 변수명이라는 표기");

        /*
         * boolean, char, string 단독으로 예약어가 존재하기 때문에 상관 X
         *
         * 예약어(자료형,참조형) 변수명 = 리터럴
         * [정수형]
         * 정수형은 기본적으로 리터럴이 int 로 설정되어 있음
         * int (4byte) 안에서 int 보다 byte 크기가 작은 short/byte 로 리터럴 변경할 경우
         * 자동으로 타입 변환이 일어나고, 값이 해당 타입의 범위를 초과하면, 오류가 발생함
         *
         * ex)
         * byte : -128 ~ 127
         * byte 바이트1번 = 123; // 가능
         * byte 바이트2번 = 1234; // 기본적으로 불가능
         *
         * long 변수명 = 리터럴 int
         * long 롱1번 = 10000000000000; // 불가능
         *
         * int 는 위에서 작성한 숫자 범위를 초과하가ㅣ 때문에 초과하는 숫자를 담기 위해서는 뒤에 L 이나 l 을 붙여주야 함
         *
         * long 변수명 = 리터럴 long
         * long 롱2번 = 10000000000000L; //long 을 사용, long 리터럴은 L이 필수로 뒤에 와야함
         *
         * [실수형]
         * 실수형 은 기본적으로 리터럴이 double 로 설정됨
         * float 은 대략 소수점 아래 7자리 까지만 표기 가능
         *
         * 8자리부터 버리기 때문에 안전하게 가져올 수 있도록 double 을 기본으로 사용
         * 소수점 아래 8자리 이사이 아닐 경우, 숫자 뒤에 f 붙여서 절반공간의 크기만 사용하겠다 표기
         *
         * double 변수명 = 리터럴 double
         * double 더블1번 = 3.14;
         *
         * float 플롯1번 = 3.14F; // F f 붙여줘야 함
         *
         * 플롯1번 의 공간의 크기를 float 으로 주고 실수 뒤에 f 를 붙여주지 않으면,
         * 실수는 기본 리터럴 형인 double 로 인식이 되어 오류가 발생
         * 앞의 예약어를 float 으로 작성했다면 소수 뒤에는 f 를 붙여주는 것
         *
         * L 이나 F 같은 리터럴 표기법은 컴퓨터가 자료형을 구분하기 위한 기호라 출력시 보여지지 않음
         * */

        char 문자1번 = '가'; // 숫자로 44032
        char 문자2번 = 'a'; // 숫자로 97 이름으로 저장
        // char 문자3번 = "A"; char 은 ''로 표기


        float 소수1번 = 3.14f; // Type mismatch : cannot covert float
        System.out.println(문자1번 + 문자2번 + 소수1번); // 44032 + 97 + 3.14 모두 더한 값이 출력
        System.out.println(문자1번);
        System.out.println(문자2번);
        System.out.println(소수1번);

    }

}
