package com.kh.oop.bank;

public class AccountRun {
    public static void main(String[] args) {
        Account acc = new Account();

        //set 을 이용한 간접 접근
        acc.setName("동그라미");
        acc.setAccountNumber("1234-56-789");
        acc.setBalance(100);
        acc.setPassword("1234");

        //get 을 이용해서 저장된 값 확인
        System.out.println(acc.getName());
        System.out.println(acc.getAccountNumber());

        //balance 에는 정수형이 들어갈 수 있음

        System.out.println("=== 계좌에 입금을 시작합니다 ===");
        acc.deposit(1234);
        acc.deposit(10000);

        System.out.println("=== 계좌에 출금을 시작합니다 ===");
        acc.withdraw(1234);
    }
}
