package com.kh.CollectionEx.pack1.listPre1;

import java.util.ArrayList;

public class ArrayListPre2 {

    //method1 정수형
    public void method1(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("정수형 리스트 초기값 : " + list);
        //삭제 : remove("값"), remove(int indexNumber)
        //정수같은 경우 index 도 숫자로 작성하고, 정수값도 정수로 작성하기 때문에
        //정수.값(30) 으로 갖는 값 제거 : remove(Integer.valueOf(N))
        list.remove(Integer.valueOf(30));
    }
}
