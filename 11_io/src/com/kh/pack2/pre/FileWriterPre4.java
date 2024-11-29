package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterPre4 {

    public static void test(File file) {
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write("\n떡볶이");
            fw.write("\n순대");
            fw.write("\n마라탕");
            fw.close();
            System.out.println("file written");
        } catch (Exception e) {
            System.out.println("file not written");
            return;
        }
    }

    public static void main(String[] args) {

        File f1 = new File(System.getProperty("user.home") + "/바탕 화면/menu.txt");

        try {
            if (!f1.exists()) {
                f1.createNewFile();
                System.out.println("file created");
            } else {
                System.out.println("already exists");
                test(f1);
            }
        } catch (Exception e) {
            System.out.println("file not created");
            return;
        }

        test(f1);
    }
}

