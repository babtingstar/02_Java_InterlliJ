package com.kh.pack2.pre2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritepre {

    /*
    createTxt(path, filename)
    @param
    @param
     */

    public void createTxt(String path, String filename) {
        File file = new File(path + filename);
        if (file.exists()) {
            System.out.println("File already exists");
            return;
        } else {
            try {
                file.createNewFile();
                System.out.println("File created");
            } catch (IOException e) {
                System.out.println("Error not created");
                return;
            }
        }
    }

    public void writeTxt(String path, String filename) {
        File file = new File(path + filename);

        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        } else {
            try {
                FileWriter fw = new FileWriter(file);
                String exTxt = "이름 : " +
                        "\n 성함 : " +
                        "\n 연락처 : ";
                fw.write(exTxt);
                fw.close();
                System.out.println("File written");
            } catch (IOException e) {
                System.out.println("file not written");
                return;
            }
        }
    }
}
