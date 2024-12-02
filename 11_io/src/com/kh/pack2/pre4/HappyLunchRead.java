package com.kh.pack2.pre4;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HappyLunchRead {

    public void readTxt(String path, String filename) {

        try {
            FileReader fr = new FileReader(path + filename);
            BufferedReader br = new BufferedReader(fr);
            String line = "";

            String Line;
            while ((Line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error except file not found : " + e.getMessage());
        }

    }
}
