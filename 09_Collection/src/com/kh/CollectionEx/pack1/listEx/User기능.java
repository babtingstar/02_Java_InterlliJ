package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능 {
    private ArrayList<User> users = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public void addUser(){
        System.out.println("이름 입력 : ");
        String username = sc.nextLine();
        System.out.println("비밀번호 입력 : ");
        String password = sc.nextLine();
        System.out.println("이메일 입력 : ");
        String email = sc.nextLine();

        User user = new User(username, password, email);
        users.add(user);
    }

    public void allUsers(){
        System.out.println("\n===추가된 사용자 목록===");
        if (users.isEmpty()){
            System.out.println("등록된 사용자가 없습니다.");
        }else {
            for (User user : users) {
                System.out.println(users.toString());
            }
        }
    }

    public void removeUser(){
        System.out.println("\n 유저 제거");
        System.out.print("제거하고자 하는 유저의 이름을 입력하세요 : ");
        String name = sc.nextLine();

        boolean found=false;

        for(int i = 0; i<users.size(); i++){
            if(users.get(i).getName().equals(name)){
                users.remove(i);
                System.out.println("["+name+"] 유저가 성공적으로 제거되었습니다.");
                found=true;
                break;
            }
        }

        if(!found){
            System.out.println("해당 유저를 찾을 수 없습니다 : " +name);
        }
    }
}
