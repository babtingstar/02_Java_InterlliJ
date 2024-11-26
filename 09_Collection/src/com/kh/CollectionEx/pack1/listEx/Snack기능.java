package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Snack기능 {

    //과자 추가하기
    public void addSnack(){
        Scanner sc = new Scanner(System.in);
        System.out.print("과자명을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("과자 가격을 입력하세요 : ");
        int price = sc.nextInt();

        System.out.print("과자 재고수량을 입력하세요 : ");
        int quantity = sc.nextInt();

        sc.nextLine();
        sc.close();

        //과자정보를 저장하는 저장클래스 소환
        Snack snack1 = new Snack(name, price, quantity); // Scanner 로 입력받은 과자명, 가격, 수량이 들어감);
        Snack snack2 = new Snack("snack2_name", 2222   , 2); // Scanner 로 입력받은 과자명, 가격, 수량이 들어감);
        Snack snack3 = new Snack("snack3_name", 3333, 3); // Scanner 로 입력받은 과자명, 가격, 수량이 들어감);


        //과자정보를 목록으로 저장하는 배열 리스트 소환
        ArrayList<Snack> snacks = new ArrayList<Snack>();
        snacks.add(snack1); // 과자 목록들에 새로 입력받은 과자 한개에 대한 정보를 저장
        snacks.add(snack2); // 과자 목록들에 새로 입력받은 과자 한개에 대한 정보를 저장
        snacks.add(snack3); // 과자 목록들에 새로 입력받은 과자 한개에 대한 정보를 저장

        //System.out.println(snacks.toString());
        // 모두 출력하되, 한 줄 씩 출력이 되릭 원한다면 enhanced for / for 문을 이용
        // size()를 이용해서 몇개 들어있는지 확인

        System.out.println("***** 과자 목록 리스트 출력 *****");
        for(int i=0; i<snacks.size(); i++){
            snacks.get(i);
            System.out.println(snacks.get(i));
        }
    }
}
