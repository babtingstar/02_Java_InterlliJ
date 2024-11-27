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
        String price = sc.nextLine();

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

    public void removeClothing(){
        System.out.println("\n === 옷 제거 ===");
        System.out.print("제거하고자 하는 옷의 이름을 입력하세요 : ");
        String name = sc.nextLine();

        boolean found=false;

        for(int i = 0; i<clothingList.size(); i++){
            if(clothingList.get(i).getName().equals(name)){
                clothingList.remove(i);
                System.out.println("["+name+"] 옷이 성공적으로 제거되었습니다.");
                found=true;
                break;
            }
        }

        if(!found){
            System.out.println("해당 옷을 찾을 수 없습니다 : " + name);
        }
    }

}
