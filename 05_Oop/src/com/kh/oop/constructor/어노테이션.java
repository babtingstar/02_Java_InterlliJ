package com.kh.oop.constructor;

public class 어노테이션 {

    /*
    @(어노테이션, Annotation)


    자주 사용되는 기본 어노테이션
    @Override
    오버라이딩
        처음에 메서드를 작성한 클래스에서 처음에 만들어진 메서드를
        두번째 이후 다른 클래스가 자식 클래스에 맞게 다시 구현하는 것을 말함

        부모 클래스에서 메서드에 주과된 이름, 매개변수, 리턴타입은 그대로이지만
        메서드의 동작은 변경할 수 있음

        예를 들어 toString 메서드가 대표적인 예
        최초로 _toString_이 만들어진클래스.java
        toString() 메서드 기능을 만들 때
        return 값으로 String으로 묶어서 필드값을 확인하게 만들자

            toString() 만들어진 기능을 클래스 필드에 맞게 재사용
            toString() 과 같은 기능을 사용할 때는
            @Override 를 안붙여도 작동은 하지만 붙여주는 게 좋음
     */

    /*
    getter setter constructor toString 과 같이 자주 사용하는 메서드는
    lombok이라는 회사 기능을 활요ㅕㅇ해서

    @Getter
        public String getName(){
        return name;
        }

    @Setter
        public void setName(name){
        this.name = name;
        }

    constructor(생성자)

    @NoArgsConstructor
        public className(){ }

    @AllARgsConstructor
        public className(...){}
     */

}
