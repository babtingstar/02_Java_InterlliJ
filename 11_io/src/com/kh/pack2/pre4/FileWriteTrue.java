package com.kh.pack2.pre4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTrue {
    public void writeTxt() {
        String path = System.getProperty("user.home") + "/바탕 화면/";
        String ext = ".txt";
        Scanner scanner = new Scanner(System.in);
        System.out.print("내용을 추가할 파일명을 입력하세요 : ");
        String fileName = scanner.nextLine();

        File file = new File(path + fileName + ext);
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다.");
            System.out.print(fileName + "파일을 생성하시겠습니다?(Yes/No) : ");
            String yn = scanner.nextLine();
            if (yn.equalsIgnoreCase("YES")) {
                try {
                    file.createNewFile();
                    System.out.println("파일을 생성했습니다.");
                } catch (Exception e) {
                    System.out.println("존재하지 않는 파일 생성에 실패했습니다." + e.getMessage());
                } finally {
                    System.out.println("존재하지 않는 파일 생성 프로세스 종료.");
                }
            } else {
                System.out.println("파일을 생성하지 않았습니다.");
                return; // break 쓰면 밑의 try 문(파일 내용 추가 구절) 실행하기 때문에 return 사용
            }
        }
        try (FileWriter fw = new FileWriter(file, true)){
//            FileWriter fw = new FileWriter(file, true);
            Scanner sc = new Scanner(System.in);
            String input;
            while (true) {
                System.out.println("===파일에 내용 추가중===");
                System.out.print("추가할 내용 입력(종료 : exit 입력) : ");
                input = sc.nextLine();
                if(input.equalsIgnoreCase("exit")) {
                    System.out.println("내용 작성을 종료합니다.");
                    return;
                }else {
                    fw.write("\r\n" + input);
                    /*
                    \r : 키보드 커서를 현재 줄의 맨 앞으로 이동시킴
                         \naver 와 같은 상황이 발생할 경우를 방지하기 위해 커서를 기본적으로 맨 앞으로 보냄
                         \n 을 활용하여 줄바꿈 처리를 할 수 있도록 설정
                     */
                    System.out.println("내용이 추가되었습니다. ");
                }
            }
//            fw.close();
        } catch (IOException e) {
            System.out.println("내용 추가 중 에러 발생 : " + e.getMessage());
        } finally {
            System.out.println("내용 추가 프로세스 종료.");
        }

    }


}

