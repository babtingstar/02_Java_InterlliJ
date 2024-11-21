package com.kh.oop.field.pack1;

//필드 속성(값)에 대한 정리
public class FieldEx1Run {
    public static void main(String[] args) {
        FieldEx1 f1 = new FieldEx1();
        f1.method1();
        //변수에 무엇이 적혀있는지 출력문을 통해 확인하기
        System.out.println(f1.퍼블릭필드);
        System.out.println(f1.프로텍티드필드);
        System.out.println(f1.디폴트필드);
        //.out.println(f1.프라이빗필드); - 프라이빗은 접근 불가
        // 다른 클래스에서 단순 변수명으로 접근 할 수 없기 때문
    }
}
