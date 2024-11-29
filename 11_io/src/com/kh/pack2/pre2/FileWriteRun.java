package com.kh.pack2.pre2;

public class FileWriteRun {
    public static void main(String[] args) {
        FileWritepre fwp = new FileWritepre();
        String filename = "user.txt";
        String filepath = System.getProperty("user.home") + "/바탕 화면/";

        System.out.println("file create start");
        fwp.createTxt(filepath, filename);

        //writeTxt(path, fileName) 기능을 가져와서
        //user.txt.이름 성함 연락처 작성하고 저장하기

        fwp.writeTxt(filepath, filename);
    }

}
