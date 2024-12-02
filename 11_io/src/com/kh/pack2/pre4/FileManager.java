package com.kh.pack2.pre4;

import java.io.*;
import java.util.Scanner;

public class FileManager {

    String path;
    String createFileName;

    /*
    파일을 생성하는 기능
    createFile(path, createFileName);

    @param path; 파일 경로
    @param createFileName 생성하고자 하는 파일 이름
     */
    public void createFile(String path, String createFileName) {
        File file = new File(path, createFileName);
        if (file.exists()) {
            System.out.println("File already exists");
            return;
        } else {
            try {
                file.createNewFile();
                System.out.println("File created : " + path + createFileName);
            } catch (IOException e) {
                System.out.println("File creation failed" + e.getMessage());
            } finally {
                System.out.println("File creation completed/aborted");
            }
        }
    }

    /*
    파일을 읽는 기능
    createFile(path, createFileName);

    @param path; 파일 경로
    @param createFileName 읽고자 하는 파일 이름
     */
    String readFileName;

    public void readFile(String path, String readFileName) throws FileNotFoundException {
        File file = new File(path, readFileName);
        if (!file.exists()) {
            System.out.println("File does not exist");
            System.out.println("try another File or check Filename : " + file.getAbsolutePath());
            return;
        } else {
            try(FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);) {
                /*
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                */
                String line;
                System.out.println("Reading file : ");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found : " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IO Exception : " + e.getMessage());
            } finally {
                System.out.println("File read completed/aborted");
            }

        }
    }

    /*
    파일에 내용을 이어쓰는 기능
    createFile(path, createFileName);

    @param path; 파일 경로
    @param createFileName 이어서 작성하고자 하는 하는 파일 이름
     */
    String writeFileName;

    public void writeToFile(String path, String writeFileName) {

        File file = new File(path, writeFileName);
        if (!file.exists()) {
            System.out.println("File does not exist / create File ");
            return;
        }
        try { //
            FileWriter fw = new FileWriter(file, true); // default : false : true 작성해야 이어서 작성하기 가능
            Scanner sc = new Scanner(file);
            System.out.println("File Writing");
            System.out.println("'exit' dont want to");
            System.out.print("Writing file : ");
            while (true) {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("exit")) { // 대소문자 관계없이
                    return; // 종료
                }
                fw.write("\n" + input);
            }
            /*
            ********************************************************************************
            fw.close();
            try 옆에 () 만들고 close 를 해야하는 객체를 작성하면, try 자체에서 close 작업 진행
            close 기능을 작성하지 않아도 됨
            ********************************************************************************
             */
        } catch (IOException e) {
            System.out.println("Writing Error : " + e.getMessage());
        } finally {
            System.out.println("File write completed/aborted");
        }
    }

}
