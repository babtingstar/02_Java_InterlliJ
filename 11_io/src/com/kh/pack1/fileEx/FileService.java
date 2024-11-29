package com.kh.pack1.fileEx;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    // method2 : 파일이 존재하는지 확인하고 존재하지 않으면 파일 생성
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

    // method3 : 클래스 객체를 이용해서 특저위치 폴더에 있는 모든 파일과 폴더를 배열 형태로 가져오기
    public void method3(){
        System.out.println("확인하고자 하는 폴더 경로 : " + System.getProperty("user.home") + "/Downloads");


        // file 에서 c:/users/user1/downloads 위치까지 설정
        File file = new File(System.getProperty("user.home") + "/Downloads");

        // 특정 폴더 위치에 있는 파일과 폴더들을 배열 형태로 가져올 것
        File[] files = file.listFiles();

        for(File f : files){
            System.out.println(f.getName());
            System.out.println(f.length());
            System.out.println(f.lastModified()); // 1970 1월 1일부터 경과 계산
            //Cannot format given Object as a Date : 수정 날짜 저장 공간 모자를 수 있다는 에러
            //float 이 아니라 long 으로 받아와야 함

            long lastModified = f.lastModified();
            Date date = new Date(lastModified);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String formatDate = sdf.format(date);
            String formatDate2 = sdf.format(f.lastModified());
            System.out.println(date);
        }



    }


}
