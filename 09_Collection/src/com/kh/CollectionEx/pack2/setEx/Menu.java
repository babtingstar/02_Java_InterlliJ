package com.kh.CollectionEx.pack2.setEx;

import java.util.Objects;

public class Menu {
    private int id;
    private String name;
    private double price;

    public Menu() {
    }

    public Menu(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /*
    객체가 같다(동일, 동등)을 어떻게 비교할 것인가?
    - 동일 : 가르키고 있는 객체가 같음 : object:hashCode()
    - 동등 : 내부 값이 같음 : Object.equals()

    동등 비교 : Object.equals() 메서드 재정의(오버라이딩)
                현재 객체 필드와 전달받은 객체의 필드가 모두 같을 경우 true, 아니면 false\

    동일 비교 : Object.hashCode() 메서드 재정의(오버라이딩)
                hash 함수 : 값을 넣으면 같은 길이의 문자열이 반환되는 함수

    hashCode() : 객체별 식별 코드(객체를 구분하는 정수 값) 반환
                 주민등록번호, 학번, 은행 번호표과 같이 암호화 처리를 진행해야 할 때 사용
     */

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Menu menu)) return false; // parameter 가 menu 타입인지 확인
        return Double.compare(price, menu.price) == 0 && Objects.equals(id, menu.id) && Objects.equals(name, menu.name);
        //double.compare == 0  :  정수/실수 비교에 사용, 같으면 =0 / 좌>우 이면 >0 / 좌<우 이면 < 0
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    //equals : 두 값이 논리적으로 같은 지 비교 = 동일한 주소를 가지고 있는지 확인
    //         재정의 후 사용할 경우 객체 안에서 특정 필드 값이 같을 때 논리적으로 같다고 정의하고 비교 내용
    //hashCode : 두 값이 논리적으로 같은 지 비교
    //           주소를 기반으로 해시 값을 계산해서 계산 결과가 같은지 확인하고, 같다면 해시 코드를 반환

    //hash : 데이터를특정 규칙에 따라 조작하거나 변환하는 것을 의미
}
