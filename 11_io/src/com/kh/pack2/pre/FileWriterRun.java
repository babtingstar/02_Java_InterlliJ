package com.kh.pack2.pre;

public class FileWriterRun {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/바탕 화면";
        String filename = "food.txt";

        FileWriterPre5 fwp5 = new FileWriterPre5();
        // 파일 생성하기
        // 파일 생성기능(path , filename)
        fwp5.creatFile(path, filename);

        // 파일 작성기능
        fwp5.writeFile(path, filename);
    }
}
