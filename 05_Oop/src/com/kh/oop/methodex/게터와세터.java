package com.kh.oop.methodex;

public class 게터와세터 {
    /*
    Getter : 클래스의 private 멤버 변수 값을 반환하는 메서드
             외부에서 객체의 멤버 변수 값을 간접적으로 읽을 수 있게 함

             값을 전달하기 때문에
             public 자료형 get변수명(){
                return 변수명;
             }

    Setter : 클래스의 private 멤버 변수 값을 설정하는 메서드
             외부에서 객체의 멤버 변수 값을 간접적으로 변경할 수 있게 함
             값을 전달하는 것이 아니라 설정하기 때문에
             public void set변수명(멤버변수에 저장할 값을 가져오는 매개변수명){
                this.변수명 = 매개변수명;
             }

    setter 안에서 유효성 검사라는 코드를 작성하는 것을 볼 수 있는데,
    setter 안에 유효성 검사 X
    setter 에 값을 넣어주기 전에 유효성 검사를 한 후, setter 에 넣어주는게 맞음
     */
}
