package com.kh.oop.constructorPre;

public class Lotto {
    private int[] lotto = new int[6];

    public Lotto() {
    }

    public void randomNumber(){
        int count = 0;
        while(count < 6){
            int num = (int)(Math.random()*45) + 1; // Math.random()*45 => 0~44
                                                    // double -> int 는 소수점 아래 버림
            boolean 중복확인 = false;

            for(int i = 0; i < count; i++){
                if(num == lotto[i]){
                    중복확인 = true;
                    break; // 중복 O -> 재생성으로 돌려보냄
                }
            }

            if(!중복확인){
                lotto[count] = num;
                count++;
            }
        }
    }

    public void info(){
        if(lotto == null){
            System.out.println("로또 번호가 생성되지 않았습니다.");
            return;
        }
        System.out.print("로또 번호 확인하기 : ");
        for(int i = 0; i < 6; i++){
            System.out.print(lotto[i] + " ");
        }
    }
}
