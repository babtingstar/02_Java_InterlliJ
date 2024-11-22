package com.kh.oop.bank;

public class Account {
    private String name;
    private String accountNumber;
    private double balance;
    private String password;

    public void setName(String name) {
        this.name = name;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getPassword() {
        return password;
    }

    //balance(잔액)에 전달받은 금액을 누적 후, 금액을 콘솔창에 출력
    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " 의 현재 잔액 : " + balance);
    }

    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(name + " 의 현재 잔액 : " + balance);
        }else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
