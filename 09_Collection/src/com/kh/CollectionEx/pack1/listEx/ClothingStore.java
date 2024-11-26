package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothingStore {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Clothing> clothingList = new ArrayList<Clothing>();

    public void AddClothing() {

        System.out.print("옷 이름 : ");
        String name = sc.nextLine();
        System.out.print("카테고리 (상의/하의/외투 등) : ");
        String category = sc.nextLine();
        System.out.print("가격 : ");
        int price = sc.nextInt();
        sc.close();

        Clothing clothing1 = new Clothing(name, category, price);
        clothingList.add(clothing1);
        System.out.println("[" + name + "] 추가 완료!");
    }

    public void AllClothing() {
        System.out.println("===추가된 옷 목록===");
        if (clothingList.isEmpty()) {
            System.out.println("등록된 옷이 없습니다.");
        } else {
            for (int i = 0; i < clothingList.size(); i++) {
                System.out.println(clothingList.toString());
            }
        }
    }

}
