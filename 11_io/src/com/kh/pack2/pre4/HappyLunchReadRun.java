package com.kh.pack2.pre4;

public class HappyLunchReadRun {
    public static void main(String[] args) {

        String path = System.getProperty("user.home") + "/바탕 화면/";
        String filename = "happyLunch.txt";

        HappyLunchRead frp = new HappyLunchRead();

        System.out.println("[" + filename +"] 읽기 모드를 시작합니다.\n");
        frp.readTxt(path, filename);
    }
}
