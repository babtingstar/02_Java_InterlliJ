package com.kh.CollectionEx.pack2.setEx;

import java.util.HashSet;

public class MenuService {

    private HashSet<Menu> menuSet = new HashSet<>();

    //메뉴 추가
    public void addMenu(Menu menu) {
        if(menuSet.add(menu)) { // id name price 모두 동일할 때 기준, 기존에 없는 메뉴라면
            System.out.println("메뉴가 추가되었습니다. " + menu);
        } else {
            System.out.println("이미 존재하는 메뉴입니다. " + menu);
        }

    }

    //메뉴 삭제
    public void removeMenu(int id) { // id 값을 입력받아서 삭제
        for(Menu menu : menuSet) { // 메뉴리스트 순차적 확인
            if(menu.getId() == id) { // input id 가 존재한다면
                menuSet.remove(menu); // 해당 메뉴값 삭제
                break;
            }
        }
    }

    //메뉴 검색
    public Menu searchMenu(int id) { // id 값을 입력받아서 검색
        for(Menu menu : menuSet) { // 메뉴리스트 순차적 확인
            if(menu.getId() == id) { // input id 가 존재한다면
                return menu; // 해당 메뉴값 return
            }
        }
        System.out.println("반환할 자료가 없습니다.");
        return null;
    }

    // 추가된 메뉴 출력
    public void printAllMenu() {
        System.out.println("===모든 메뉴 출력하기===");
        for (Menu menu : menuSet) {
            System.out.println(menu);
        }
    }
}
