package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre {
    public static void main(String[] args) {
        File f1 = new File(System.getProperty("user.home") + "/바탕 화면/hello.txt");

        try {
            if(!f1.exists()){
                f1.createNewFile();
                System.out.println("file created");
            }else {
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            System.out.println("file creation failed");
        }

        try {
            FileWriter fw = new FileWriter(f1);
            fw.write("안녕하세요 Hello Hi");
            fw.close();
            System.out.println("file written successfully");
        }catch (IOException e) {
            System.out.println("file writing failed");
            return;
        }
    }
}
