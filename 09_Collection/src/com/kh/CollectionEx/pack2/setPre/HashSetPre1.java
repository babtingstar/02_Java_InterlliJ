package com.kh.CollectionEx.pack2.setPre;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPre1 {
    /*
    Set
    - 기본적으로 순서를 유지하지 않음(index가 없음)
    - 중복데이터 저장 x

    Set 인터페이스의 자식 클래스
        1. HashSet (대표적) : 처리 속도가 빠른 Set
        2. LinkedHashSet
        3. TreeSet

        2, 3 쓰지 않고 ArrayList 씀
     */

    //method1() 과일을 넣고 중복 허용되는지 확인
    public void method1(){
        HashSet set = new HashSet(); // 자료형 상관 x
        set.add("점심");
        set.add(true);
        set.add(3.14);

        set.add("점심");
        set.add("저녁");
        set.add("점심2");
        System.out.println(set); // toString() 생략

        ArrayList list = new ArrayList();
        list.add(1);
        list.add("점심");
        list.add("점심");
        list.add("점심");
        list.add("저녁");
        list.add("저녁2");
        System.out.println(list);


    }

    public void method2(){
        HashSet<String> set = new HashSet<String>();
        set.add("사과");
        set.add("바나나");
        set.add("포도");
        set.add("사과");


        System.out.println("set 전체 출력 : " + set);
        System.out.println("set size() : " + set.size());

        set.add("사과 ");
        set.add(" 사과 ");

        System.out.println("add(_사과) add(_사과_) 이후 set 전체 출력 : " + set);
        System.out.println("add(_사과) add(_사과_) 이후 set size() : " + set.size());

        set.remove("포도");
        System.out.println("remove(포도) 이후 set 전체 출력 : " + set);

        set.contains("바나나"); // 바나나가 있는지 확인
        System.out.println(set.contains("바나나")); // 확인결과 출력

        set.clear();
        System.out.println("isEmpty 이후 isEmpty(set) 출력 : " + set.isEmpty());
        System.out.println("isEmpty 이후 set : " + set);
    }

    public void method3(){
        HashSet<Integer> intset = new HashSet<Integer>();

        intset.add(10);
        intset.add(200);
        intset.add(3000);
        intset.add(500);
        intset.add(40);

        System.out.println("set 출력 : " + intset);

        intset.remove(3000);
        System.out.println("remove(3000) 이후 set 출력 : " + intset);


        intset.contains(500);
        System.out.println("set.contains(500) : " +intset.contains(500));

        intset.clear();
        System.out.println("set.clear() 이후 set 출력 : " +intset);
    }

    public void method4(){
        HashSet<String> strList = new HashSet<String>();
        strList.add("참외");
        strList.add("토마토");
        strList.add("수박");

        System.out.println("strList : " + strList);

        for(String s : strList){
            System.out.println(s);
        }

    }

    public void method5(){
        HashSet<String> str = new HashSet<String>();
        str.add("딸기");
        str.add("사과");
        str.add("바나나");
        str.add("포도");

        //Iterator 반복문을 이용해서 HashSet출력
        //HashSet 목록을 담고 있는 str 변수명을 가져와서 반복하는 설정
        Iterator<String> it = str.iterator();
        while(it.hasNext()){ // hasNext 값(다음 hash 값)이 존재한다면 true
            System.out.println(it.next());
            // it에 str 꺼낸 값을 지정, 이후 다음 str 값을 it에 넣음
        }
        /*
        Iterator : 컬렉션을 순차적으로 회전하는 객체
                    HashSet, ArrayList 등 Collection 으로 작성된 객체들 모두 사용

        .iterator() : 반복을 원하는 변수명 뒤에 작성한 후 반복을 하겠다는 설정
                        값에다가 순차적으로 접근

        .hasNext() : 반복할 수 있는 값이 남아있는지 확인
                        return boolean

        it.next() : 현재 Iterator 가 가리키고 있는 현재 값을 보여주고, 그 다음에 자동으로 다음 값으로 이동
         */

        // set 의 경우 대표적으로 Lotto 번호 생성할 때 사용
    }

    public void iterLotto(){
        HashSet<Integer> lottoNumbers = new HashSet<Integer>();

       for (int i = 0; i < 6; i++) {

           /*
           Math.random() : 0.000000 ~ 1.000000 사이의 소수를 출력
           Math.random()*45 : 44.~
           (int)Math.random()*45 : 0 ~ 44
           (int)Math.random()*45 + 1 : 1 ~ 45
            */
           int num = (int) (Math.random() * 45 + 1);
           lottoNumbers.add(num);

           /*
           Iterator<Integer> it = lottoNumbers.iterator();
           System.out.println("===로또 번호===");
           while(it.hasNext()){
               System.out.println(it.next());
           */

           for(int n : lottoNumbers){
               System.out.println(n);
           }
       }
    }
}
