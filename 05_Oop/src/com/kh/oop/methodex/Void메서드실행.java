package com.kh.oop.methodex;

public class Void메서드실행 {
    public static void main(String[] args) {
        Void메서드 v1 = new Void메서드();
        v1.method1();

        String userId = "홍길동";
        v1.method2(userId); // = v1.method2("홍길동");

        int userAge = 0;
        v1.method3(userAge);

        v1.method4("박철수", 50);

        String id = "kht";
        String pw = "kht1121@";
        v1.login(id, pw);
    }
}
