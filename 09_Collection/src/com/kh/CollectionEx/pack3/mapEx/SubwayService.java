package com.kh.CollectionEx.pack3.mapEx;

import java.util.HashMap;
import java.util.Scanner;

public class SubwayService {

    public void method1(){
        HashMap<String, Integer> menu = new HashMap<>();

        menu.put("이탈리안 비엠티 : ", 6200);
        menu.put("치킨 데리야끼 : ", 6300);

        //메뉴 출력 함수 호출

        System.out.println("서브웨이 메뉴에 따른 가격 목록 : " + menu);
    }

    public void method2(){

        HashMap<String, Integer> menu = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("추가하고자 하는 샌드위치 이름 : ");
        String menuName = scanner.nextLine();
        System.out.print("해당 샌드위치의 가격 : ");
        int menuPrice = scanner.nextInt();
        scanner.nextLine();

        menu.put(menuName, menuPrice);

        System.out.println("추가한 메뉴 이름과 가격 : " + menu);
    }
}
