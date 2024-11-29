package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;

public class FileWritePre3 {
    public static void main(String[] args) {
        File f1 = new File(System.getProperty("user.home") + "/바탕 화면/menu.txt");
        try {
            if(!f1.exists()){
                f1.createNewFile();
                System.out.println("file created");
            }else {
                System.out.println("already exists");
            }
        }catch (Exception e) {
            System.out.println("file not created");
            return;
        }

        try{
            FileWriter fw = new FileWriter(f1, true);
            fw.write("\n");
            fw.write("\n양식");
            fw.write("\n한식");
            fw.write("\n중식");
            fw.write("\n일식");
            fw.close();
            System.out.println("file written");
        }catch (Exception e) {
            System.out.println("file not written");
            return;
        }
    }
}
