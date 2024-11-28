package com.kh.CollectionEx.pack3.mapPre;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapService {


    public void method1() {
        HashMap<String, String> 나라들 = new HashMap<String, String>();

        나라들.put("KR", "korea");
        나라들.put("US", "United States");
        나라들.put("EU", "Europe");

        System.out.println("\n각 국가들의 약칭 확인하기 : " + 나라들);
        //{EU=Europe, KR=korea, US=United States} : 삽입 순서 따라가지 않음

        나라들.put(" KR", "korea");
        나라들.put("KR ", "korea");
        나라들.put(" KR ", "korea");

        System.out.println("\nkorea 3번 추가하고 각 국가들의 약칭 확인하기 : " + 나라들);
        // {EU=Europe,  KR =korea, KR=korea,  KR=korea, KR =korea, US=United States} : 공백 구별함

        System.out.println("\n--------------------------------------------------");
        System.out.println(나라들.get("EU")); // Europe 반환
        System.out.println(나라들.get("CN")); // null 반환

        System.out.println("저장된 나라 종류 수 : " + 나라들.size()); // return 값은 int

        나라들.remove("KR "); // 일치하는 키가 있으면 return value
        나라들.remove("EU "); // 일치하는 키가 없으면 null
        System.out.println("제거 후 나라들 출력 : " + 나라들);
        System.out.println("제거 중(EU_) 출력 : " + 나라들.remove("EU "));

        System.out.println("clear 이전에 값 유무 확인 : " + 나라들.isEmpty());
        나라들.clear();
        System.out.println("clear 이후에 값 유무 확인 : " + 나라들.isEmpty());


    }


    // Map 은 index 가 없기 때문에 반복문을 이용해서 접근
    public void method2() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("학원", "강남구");
        map.put("집", "경기도");
        map.put("63빌딩", "서울시 영등포구");
        map.put("롯데타워", "서울시 송파구");

        Set<String> set = map.keySet(); // set 에는 map 의 key 만 저장
        System.out.println("keySet 확인 : " + set);
        for (String key : set) { // set 에 저장된 key 을 반복문으로 호출
            System.out.println(key + " = " + map.get(key)); // 호출한 key 값을 map 의 해당 key 값에 해당하는 get value
        }
    }

    // Map 은 index 가 없기 때문에 Map.entrySet()을 이용해서 접근
    public void method3() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("학원", "강남구");
        map.put("집", "경기도");
        map.put("63빌딩", "서울시 영등포구");
        map.put("롯데타워", "서울시 송파구");

        Set<Map.Entry<String, String>> entryset = map.entrySet();

        System.out.println("keySet 확인 : " + entryset);
        // set 변수명이 Map.Entry<String, String> 인 키 형태로 값을 유지
        // set 리스트에 작성된 목록들을 key 라는 변수명으로 하나씩 가져올 때,
        // Map.Entry<String, String> 형태로 가져온다는 표기

        for (Map.Entry<String, String> entry : entryset) {
            System.out.println(entry.getKey() + " = " + map.get(entry.getValue()));
        }
    }
}
