package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothingStoreRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClothingStore clothingStore = new ClothingStore();

        while (true) {
            System.out.println("\n 쇼핑몰 관리 프로그램 ");
            System.out.println("1. 옷 추가");
            System.out.println("2. 옷 목록");
            System.out.println("3. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    clothingStore.AddClothing();
                    break;
                case 2:
                    clothingStore.AllClothing();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
            }
        }
    }
}
