package com.kh.pack1.fileEx;

import java.io.File;
import java.io.IOException;

public class FileService {
    // method1 : File 클래스 객체를 이용해서 폴더가 존재하지 않으면 폴더 생성
    public void method1(){
        // C:\Users\babti\바탕화면>
        // C:\Users\babti\Desktop>
        //File 폴더 = new File("/newFolders");
        //File 폴더 = new File("Users/babti/Desktop/newFolders");
        File 폴더 = new File(System.getProperty("user.home") + "/바탕화면/newFolders");

        System.out.println("폴더 위치 : " + 폴더.getPath());
        System.out.println("폴더 절대경로 : " + 폴더.getAbsolutePath());
        // 폴더 절대경로 : C:\newFolder
        System.out.println("폴더 이름 : " + 폴더.getName());
        System.out.println("폴더가 존재하는지 확인 : " + 폴더.exists());
        //폴더 생성
        폴더.mkdir();
        System.out.println("폴더 생성함.");
        System.out.println("폴더가 존재하는지 확인 : " + 폴더.exists());

        //폴더 생성
        //폴더가 존재유무 확인 후 폴더 생성

    }

    public void method2(){
        System.out.println(System.getProperty("user.home"));
        File file = new File(System.getProperty("user.home") + "/바탕 화면/내파일.txt");

        if (file.exists()) {
            System.out.println("file exists");
        } else {
            System.out.println("file does not exist");
            try { // 폴더 만들기와 다르게 파일 만들기는 문제가 생길 가능성이 높아서 try-catch, throw 추가해 줘야 함
                file.createNewFile();
                System.out.println("created");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("file created");
        }
    }


}
