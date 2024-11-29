package com.kh.pack2.pre3;

public class FileReaderPreRun {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/바탕 화면/";
        String fileName = "happyLunch.txt";

        FileReaderPre frp = new FileReaderPre();

        System.out.println("[" + fileName + "] 읽기 모드를 시작합니다.");
        frp.readTxt(path, fileName);
    }
}
