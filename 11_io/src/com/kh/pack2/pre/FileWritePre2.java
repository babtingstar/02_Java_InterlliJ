package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre2 {
    public static void main(String[] args) {
        File f1 = new File(System.getProperty("user.home") + "/바탕 화면/lunch.txt");

        try {
            if(!f1.exists()){
                f1.createNewFile();
                System.out.println("file created");
            }else {
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            System.out.println("file creation failed");
            return;
        }

        try {
            FileWriter fw = new FileWriter(f1);
            fw.write(" 먹고싶은 점심메뉴 리스트 1" +
                    "\n 먹고싶은 점심메뉴 리스트 2" +
                    "\n 먹고싶은 점심메뉴 리스트 3" +
                    "\n 먹고싶은 점심메뉴 리스트 4");
            fw.close();
            System.out.println("file written successfully");
        }catch (IOException e) {
            System.out.println("file writing failed");
            return;
        }
    }
}
