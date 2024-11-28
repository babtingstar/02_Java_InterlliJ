package com.kh.pack1.filePre;

import java.io.File;
import java.io.IOException;

public class FolderPre1 {
    // 바탕화면에 profileImage 라는 폴더 존재 확인하고, 없다면 폴더 생성, 존재하면 메세지 출력
    public void method1(){
        File folder1 = new File("C:/Users/babti/바탕 화면/newfolder");
        if(!folder1.exists()){
            System.out.println("not found");
            folder1.mkdir();
            System.out.println("created");
        }else {
            System.out.println("exists");
        }
        if(folder1.exists()){
            System.out.println("afterCheck - exists");
        }else {
            System.out.println("afterCheck - not exists");
        }
    }

    public void method2(){
        File file1 = new File("C:/Users/babti/바탕 화면/newFile.txt");
        if(!file1.exists()){
            System.out.println("not found");
            try {
                file1.createNewFile();
                System.out.println("created" + file1.getAbsolutePath());
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("exists");
        }


    }
    //
}