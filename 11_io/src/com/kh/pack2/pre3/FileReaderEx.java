package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderEx {
    public void method1(){
        String path = System.getProperty("user.home") + "/바탕 화면/";
        String fileName = "lunch.txt";

        try{
            FileReader file = new FileReader(path+fileName);
            BufferedReader br = new BufferedReader(file);
            String line;

            while((line=br.readLine())!=null){
                System.out.println(line);

            }
        }catch(Exception e){

        }
    }
}
