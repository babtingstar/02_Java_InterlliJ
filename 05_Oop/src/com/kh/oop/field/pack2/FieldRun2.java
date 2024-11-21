package com.kh.oop.field.pack2;

import com.kh.oop.field.pack1.FieldEx1;

public class FieldRun2 extends FieldEx1 {
                        //  └> 프로텍티드를 사용하기 위해 FieldEx1을 상속한다는 표기
                        //     프로텍디드를 바로 Static main()에 올라올 수 없음
                        //     public return method(){} public void method(){} 의 method{} 내부에 작성해서 사용하기만 가능
    public static void main(String[] args) {
        /*
        FieldEx1 이 public 이기 때문에 pack2 폴더 안에 있는 FieldRun2에서 객체 가져와서 생성 가능
         */
        FieldEx1 f1 = new FieldEx1();
        System.out.println(f1.퍼블릭필드); // 어디서든 접근이 가능
//        System.out.println(f1.프로텍티드필드); // 같은 패키지 or 다른패키지는 상속받은 경우에만 사용
//        System.out.println(f1.디폴트필드); // 같은 패키지에서만 사용 가능
//        System.out.println(f1.프라이빗필드); // 같은 클래스에서만 사용 가능
    }

    public void method() {
        // 상속을 진행한다는 것은 상속 이후에 특정 변화가 일어나고, 변화가 일어난 이후의 값을 기능에 담아 static 전달
        // 다른 패키지이지만 상속 상태이기 때문에 기능 내부에 호출해서 사용
        System.out.println(프로텍티드필드);
    }
}