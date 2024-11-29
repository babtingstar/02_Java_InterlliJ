package com.kh.pack2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

    //파일을 바탕화면에 만들고 파일 안에 글자를 작성하기
    public void method1() {
        System.getProperty("user.home.");

        File file = new File(System.getProperty("user.home") + "/바탕 화면/ex1.txt");
        // 기존에는 createNewFile

        try {
            if (file.exists()) { // 파일이 존재하지 않는 경우 파일 생성
                System.out.println("파일이 존재합니다.");
            } else {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("파일 만들기에 실패했습니다.");
        }

        // 생성된 파일에 텍스트 작성
        // 글자를 작성할 대 BufferedWriter FileWriter 를 사용해서 작성

        try { // 파일 안에 글을 작성하는 건 문제가 많을 수 있기 때문에 예외처리 필요
            FileWriter writer = new FileWriter(file);
            String content = "안녕하세요 반갑습니다. 환영해요."; // 파일 전체 기준 덮어쓰기
            writer.write(content);
            System.out.println("파일에 내용이 작성되었습니다 : " + content); // 작성까지 하고 저장은 안함


            writer.close(); // 작성 후 종료(저장포함)


        } catch (IOException e) {
            System.out.println("내용 작성에 실패했습니다. 다시 시도해주세요. ");
            throw new RuntimeException(e);
        } finally {
            System.out.println("글쓰기 작업을 종료합니다.");
        }


    }

    //이미 존재하는 파일에 이어서 글자 작성하기(fileWriter)
    /*
    FileWriter fw = new FileWriter("filename", true);
    true : 파일 이어쓰기 모드 활성화
    false(default) : 덮어쓰기 비활성화
     */
    public void method2() {
        System.getProperty("user.home.");
        File file = new File(System.getProperty("user.home") + "/바탕 화면/ex1.txt");

        try {
            FileWriter fw = new FileWriter(file, true);
            String content = "added text";
            fw.write("\n");
            fw.write(content);
            fw.close();
            System.out.println("add successful");
        } catch (IOException e) {
            System.out.println("add failed");
        }
    }
}
