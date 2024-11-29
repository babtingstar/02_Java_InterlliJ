package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterPre5 {

    /*
    createFile(String filepath, String filename)
    {

    @param path 파일 경로
    @param fileName 파일 이름
    @return 파일 생성을 실패했을 경우 사용
     */

    public void creatFile(String path, String fileName){
        File file = new File(path + fileName);
        if(file.exists()){
            System.out.println("File already exists");
            return;
        }else {
            try {
                file.createNewFile();
                System.out.println("File is created");
            } catch (Exception e) {
                System.out.println("File not created");
                return;
            }

        }
    }

    /*
    writeFile(String filepath, String filename)
    파일안에 글자를 작성하는 기능

    @param path 파일 경로
    @param fileName 파일 이름

     */

    public void writeFile(String path, String fileName){
        File file = new File(path + fileName);

        if(!file.exists()){
            System.out.println("File not exists : " + fileName);
            return;
        }
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter(file, true);
            System.out.println("작성할 내용을 입력하세요 : ");
            String input = sc.nextLine();
            fw.write(input);
            fw.close();
        }
        catch (Exception e) {
            System.out.println("File could not be written" + fileName);
        } finally {
            sc.close();
            System.out.println("File Written : " + fileName);
        }
    }
}
