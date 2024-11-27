package com.kh.CollectionEx.pack2.setEx;

import java.util.HashSet;

public class 회원기능 {
    private HashSet<회원> users = new HashSet<>();


    public void addUser(회원 user) {
        if(users.add(user)){
            System.out.println("회원이 추가되었습니다 : " + user);
        }else {
            System.out.println("이미 존재하는 회원입니다 : " + user);
        }
    }

    public void allUser() {
        System.out.println("===모든 유저 출력하기===");
        for (회원 users : users) {
            System.out.println(users);
        }
    }

    public 회원 searchUser(int id) { // id 값을 입력받아서 검색
        for(회원 users : users) { // 메뉴리스트 순차적 확인
            if(users.getId() == id) { // input id 가 존재한다면
                return users; // 해당 메뉴값 return
            }
        }
        System.out.println("반환할 유저정보가 없습니다.");
        return null;
    }

    public void removeUser(int id) { // id 값을 입력받아서 삭제
        for(회원 user : users) { // 메뉴리스트 순차적 확인
            if(user.getId() == id) { // input id 가 존재한다면
                users.remove(user); // 해당 메뉴값 삭제
                break;
            }
        }
    }
    // 1. 생성 user
    // 2. 추가 addUser(){}
    // 3. 모두 조회 allUser(){}
    // 4. 검색 searchUser(int id)
    // 5. 삭제 deleteUser(int id)
}
