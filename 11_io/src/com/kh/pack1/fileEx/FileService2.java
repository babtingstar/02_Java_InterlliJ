package com.kh.pack1.fileEx;

public class FileService2 {

    // 1. System.getProperty()
    public void method1(){
        /*
        System.getProperty()는 Java 에서 현재 실행중인 특정 시스템의 속성 정보를 가져오는데 사용
        시스템에 대한 환경 정보나 설정 값을 얻는데 사용

        return (String)string;

          키 종류                키 값
        java.version        javaVersion 확인
        java.home           java 가 설치된 경로
        os.name             Windows / Linux / macOs 인지 확인
        user.name           현재 컴퓨터를 사용하는 사용자 이름
        user.home           현재 사용자 홈 폴더 경로
        user.dir            현재 작업하고 있는 폴더

         */
        System.getProperty("user.home");
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.dir"));
    }
}
