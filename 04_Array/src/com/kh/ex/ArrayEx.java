package com.kh.ex;

import java.util.Scanner;
import java.util.Stack;

public class ArrayEx {
    Scanner sc = new Scanner(System.in);

    /*
    배열 (자료구조)

    # Java 에서의 배열
        - 같은 자료형의 변수를 하나의 묶음으로 다루는것
        - 생성된 배열의 요소는 index 를 이용해서 구분
        - 생성된 배열을 활용하기 위해서는 배열을 참조하는 "참조형 변수"를 이용

    [참조형 변수]
        - 주소를 저장하는 변수
        - 변수 사용 시 저장된 주소를 찾아가서 그 곳에 위치한 배열, 객체를 참조
        - 기본 자료형 8개를 제외한 나머지는 모두 참조형 변수
           기본 자료형 : byte / short / int / long / char / boolean / float / double
           참조 자료형 : String / Scanner
        - 자료형의 맨 앞글자가 소문자로 시작하면 기본 자료형
        - 자료형의 맨 앞글자가 대문자로 시작하면 개발자가 만들어놓은 참조 자료형
     */

    //하나의 배열에서 하나의 자료형 사용

    // 배열 선언, 할당, 초기화
    public void method1() {
        int num;
        // 변수 선언. Stack 영역에 int 자료형을 저장할 수 있는 int 이름의 변수를 생성

        int[] arr;
        // Stack 영역에 int[] 자료형을 참조할 이름이 arr 인 변수를 생성(주소 저장)

        arr = new int[4]; // 배열 할당
        // Heap 영역에 int 10개 짜리 배열을 할당한 후, 생성된 배열의 주소를 arr 변수에 대입

        // 1) 초기화 전 → 0 이 대입되어 있는지 확인
        System.out.println("초기화 전");

        // bug : 프로그램 수행 중 발생하는 오류(=error)
        // debug : 프로그램 수행 중 특정 시점에 어떤 값을 지니고 있는지 확인하는 것. 코드 상태나 오류 분석 가능

        // 2) 인덱스를 이욯한 초기화
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 3100;
        arr[3] = 4;


        System.out.println("초기화 후");

        /*
        배열은 JS와 마찬가지로
        index = 0번부터 시작, 각 값의 자리번호를 매김
        length = 1번부터 시작해서 총 길이를 표현하는기능

        **초기화 전 :
        [Stack]                  [heap]
        arr(주소)        ----->  [0]  [1]  [2]  [3]
                                  0    0    0    0

        **초기화 후
        [Stack]                  [heap]
        arr(주소)        ----->  [0]  [1]  [2]  [3]
                                 100  200  3100  4

        초기화 전

        int[] arr; 실행 시
            - Stack 에 arr 변수 생성(주소값 x)

        arr = new int[4] 실행 시
            -

        결과적으로
            Stack : arr 변수는 Heap 배열의 주소를 가짐
            Heap : 배열이 생성되어 초기화된 상태

         arr[0] = 100
         arr[1] = 200
         arr[2] = 3000
         arr[3] = 5
         값을 넣었을 때, Heap 에 있는 배열의 각 인덱스에 지정된 값을 저장
         Stack : arr 변수에는 Heap 에 있는 배열의 주소값이 저장됨
         Heap : 주소가 가리키는 배열이 각 인데그에 할당된 값을 포함

         */

    }

    // 배열을 이용해서 Stack 과 Heap 비교
    public void method2() {
        int x = 10; // Stack 에 저장
        int[] arr = new int[3]; // Heap 저장
        arr[0] = 100; // Heap 공간의 첫 번째 칸에 100을 저장

        /*
        Stack : 휘발성
        Heap : 비휘발성

         */
    }

    public void method3() {
        // 배열 선언 + 할당
        // int arr = new in[4];
        // → 자바에게 값을 담을 공간이 배열형태임을 미리 알려주지 않으면 에러 발생
        // 반드시 int 나 변수명 앞 뒤에 []\ 붙여줘야 함
        // 단 int 같은 자료형 앞은 붙이기 x

        /*
        int arr = new int[4]; x
        []int arr = new int[4]; x
        int[] arr = new int[4]; o
        int []arr = new int[4]; o
        int arr[] = new int[4] o
        배열이름.length : 배열 길이
         */

        //for 문을 이용해서 i=0, 1, 2, 3 확인
        int[] arr = new int[4];
        for(int i = 0; i < arr.length; i++) {
            System.out.println("인덱스 위치 : " + arr[i]);
        }
    }

    //배열 역순 출력
    public void method4() {
        int arr[] = {4, 5, 6, 7, 8};

        System.out.print("배열 역순 출력"); // 가로로 이어쓰기
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

        System.out.println(arr); // [I@5dfcfece 같은 주소값 보여줌]
        System.out.println("arr 0 번째 값 " + arr[0]);
        System.out.println("arr 1 번째 값 " + arr[1]);
        System.out.println("arr 2 번째 값 " + arr[2]);
        System.out.println("arr 3 번째 값 " + arr[3]);
        System.out.println("arr 4 번째 값 " + arr[4]);
        //System.out.println("arr 5 번째 값 " + arr[5]);
        //Index % out of bound for length 5
        //index 값이 0 ~ 4 까지 있기 때문에 없는 자리를 찾는다는에러가 발생
    }

    //문자열 배열 출력
    public void method5() {
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
    }

    public void method6() {


    }
}

