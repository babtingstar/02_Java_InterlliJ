package com.kh.CollectionEx.pack2.setEx;

import java.util.Scanner;

public class MenuServiceRun {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n === 메뉴 관리 시스템 === ");
            System.out.println("1. 메뉴 추가");
            System.out.println("2. 메뉴 삭제");
            System.out.println("3. 메뉴 검색");
            System.out.println("4. 모든 메뉴 조회");
            System.out.println("5. 종료");
            System.out.print("선택 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("---메뉴 입력 명령입니다---");
                    System.out.println("메뉴 ID 입력 : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("메뉴 이름 입력 : ");
                    String name = scanner.nextLine();
                    System.out.println("메뉴 가격 입력 : ");
                    double price = scanner.nextDouble();

                    Menu menu = new Menu(id, name, price);
                    menuService.addMenu(menu);
                    break;

                case 2:
                    System.out.println("---메뉴 삭제 명령입니다---");
                    System.out.println("삭제할 메뉴 ID 입력 : ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    menuService.removeMenu(deleteId);
                    break;

                case 3:
                    System.out.println("---메뉴 검색 명령입니다---");
                    System.out.println("검색할 메뉴 ID 입력 : ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();

                    Menu m = menuService.searchMenu(searchId);
                    System.out.println(m);
                    break;

                case 4:
                    System.out.println("---메뉴 조회 명령입니다---");
                    menuService.printAllMenu();
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                    //break;
            }
        }

//        Menu menu1 = new Menu(1, "아메리카노", 2000);
//        Menu menu2 = new Menu(2, "카페라떼", 5000);
//        Menu menu3 = new Menu(3, "바닐라라떼", 5500);
//
//        menuService.addMenu(menu1);
//        menuService.addMenu(menu2);
//        menuService.addMenu(menu3);
//
//        menuService.printAllMenu();
//
//        menuService.removeMenu(2);
//
//        menuService.printAllMenu();
//
//        menuService.searchMenu(1);
//        System.out.println(menuService.searchMenu(1));
    }


}
