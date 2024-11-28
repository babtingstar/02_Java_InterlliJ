package com.kh.CollectionEx.listPre;

import java.util.Scanner;

public class DrinkServiceRun {
    public static void main(String[] args) {
        DrinkService drinkService = new DrinkService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("**************************");
            System.out.println("***** 음료 공장 메뉴 *****");
            System.out.println("1. 음료 추가 ");
            System.out.println("2. 음료 목록 ");
            System.out.println("3. 음료 검색(이름) ");
            System.out.println("4. 음료 검색(가격) ");
            System.out.println("5. 음료 삭제 ");
            System.out.println("6. 종료 ");
            System.out.println("**************************");
            System.out.print("원하는 작업 번호를 선택하세요 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("--- 음료 추가 ---");
                    System.out.print("음료 이름을 입력하세요 : ");
                    String drinkName = scanner.nextLine();
                    System.out.print("음료 가격을 입력하세요 : ");
                    int drinkPrice = scanner.nextInt();
                    Drink drinkInput = new Drink(drinkName, drinkPrice);
                    drinkService.addDrink(drinkInput);
                    break;
                case 2:
                    drinkService.allDrinks();
                    break;
                case 3:
                    System.out.println("--- 음료 검색(이름) ---");
                    System.out.print("검색할 음료명을 입력하세요 : ");
                    String searchName = scanner.nextLine();
                    drinkService.searchDrink(searchName);
                    break;
                case 4:
                    System.out.println("--- 음료 검색(가격) ---");
                    System.out.print("검색할 음료 가격을 입력하세요 : ");
                    int searchPrice = scanner.nextInt();
                    drinkService.searchDrink(searchPrice);
                    break;

                case 5:
                    System.out.println("--- 음료 삭제 ---");
                    System.out.print("삭제할 음료 이름을 입력하세요 : ");
                    String deleteName = scanner.nextLine();
                    drinkService.deleteDrink(deleteName);
                    break;

                case 6:
                    System.out.println("--- 종료합니다 ---");
                    return;

                default:
                    System.out.println("--- 입력 오류입니다 ---");
                    break;
            }


        }
    }
}
