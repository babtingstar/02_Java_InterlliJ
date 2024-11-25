package com.kh.service;

import com.kh.dto.과자;

public class 과자추가기능 {

    private 과자[] snacks;
//    {
//        {"썬칩", 2000, "매콤한맛"},
//        {"고래밥", 1000, "고소한맛"},
//        {"포카칩", 1500, "생감자맛"}
//    };
    private int count;

    public 과자추가기능(int maxSnacks){
        this.snacks = new 과자[maxSnacks];
        this.count = 0;
    }

    public boolean addSnack(String name, int price, String flavor){
        // 만약에 과자를 성공적으로 추가했다면
        if(count < snacks.length){
            snacks[count++] = new 과자(name, price, flavor);
            return true;
        }
        return false; // 배열이 가득 차서 추가 불가
    }

    public 과자[] getSnacks(){
        return snacks;
    }

    public int getCount(){
        return count;
    }
}
