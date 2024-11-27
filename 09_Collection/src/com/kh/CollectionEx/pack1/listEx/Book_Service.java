package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;

/*
컬렉션 프레임워크 : Java에서 자료구조를 만들어서 모아둔 것
java.util 폴더 안에 있음

특징
    - 크기 제한 없음(부족하면 자동으로 증가)
    - 추가 수정 삭제 검색 등 다양한 기능이 구현되어 있음

 */
public class Book_Service {
    /*
    List : 자료를 순차적으로 나열한 자료 구조(배열과 비슷함)
        - 인덱스가 존재 : 인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능
     */

    //List 사용해보기
    public void method1(){
        /*
        List 객체 생성
        - List(인터페이스) : 객체로 보기 어려움, 객체 생성 불가 - 다형성 이용
                             List 기능을 물려받은 ArrayList 클래스 활용
        */

        int arr1[] = new int[3]; // 정수형으로 3개의 값만 들어감
        ArrayList list1 = new ArrayList(3); // 3칸짜리 배열 생성, int/char/String 상관없이 들어감

        list1.add(1); // list1 index0 자리에 1 넣음
        list1.add("input any"); // list1 index1 자리에 String 입력
        list1.add(123);
        list1.add(false); // boolean, list1의 크기가 3칸에서 4칸으로 증가함

        System.out.println(list1);

        //배열의 길이 : length
        //리스트의 길이 : size() → List 에 저장된 요소(객체)의 개수를 반환
        System.out.println("list1에 저장된 값의 개수 : " + list1.size());
    }

    public void method2(){
        /*
        String 타입으로 제한된 ArrayList 객체 생성방법은 여러가지가 존재
        개발자가 원하는 타입을 제한했다면 앞 뒤로 완벽하게 String 만 사용할 수 있도록 설정하는 편이 좋음
        ArrayList<자료형> list1 = new ArrayList<자료형>(); ------> 주로 사용
        ArrayList<자료형> list1 = new ArrayList(); -> 담는 공간이 String
        ArrayList list1 = new ArrayList<자료형>();
         */

        ArrayList list1 = new ArrayList<String>();
        list1.add("닭갈비");
        list1.add("치킨");
        list1.add("보쌈");
        // list1.add(1123); 추후에 문제가 발생할 위험이 있음


    }

    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(String title, String author, int price){
        Book b1 = new Book(title, author, price);
        bookList.add(b1);
        // bookList.add(new Book(title, author, price));
        System.out.println(bookList);
        System.out.println("책이 성공적으로 추가되었습니다.");
    }

    public void removeBook(String title){
        boolean found = false;

        for (int i = 0; i < bookList.size(); i++) {
//            if(bookList.get(i).getTitle().equals(title)){
//                bookList.remove(i);
//                System.out.println("책이 성공적으로 삭제되었습니다 : " + title);
//                found = true;
//                break;
//            }
        }

        if(!found){
            System.out.println("해당 제목의 책을 찾을 수 없ㅅ브니다 : " +title);
        }

    }
}
