package com.kh.CollectionEx.pack3.mapEx;

import java.util.HashMap;

public class SnackService {
    public void method1(){
        HashMap<String, Integer> snackList = new HashMap();

        snackList.put("구름과자", 2000);

        System.out.println(snackList);
    }

    public void method2(){
        HashMap<String, String> lunchList = new HashMap();

        lunchList.put("김치찌개", "한식");
        lunchList.put("파스타", "양식");
        lunchList.put("짜장면", "중식");
        lunchList.put("스테이크", "양식");
        lunchList.put("비빔밥", "한식");

        System.out.println("입력 후 점심리스트 확인 : " + lunchList);

        System.out.println("파스타 확인 : " +lunchList.get("파스타"));

        lunchList.remove("짜장면");
        System.out.println("짜장면 제거 확인 : "+ lunchList.containsKey("짜장면"));
        System.out.println("짜장면 제거 후 점심리스트 확인 : " + lunchList);

        lunchList.put("스테이크", "한식");
        System.out.println("스테이크 변경 후 점심리스트 확인 : " + lunchList);

        lunchList.clear();
        System.out.println("clear 후 isEmpty 확인 : " + lunchList.isEmpty());
        System.out.println("clear 후 점심리스트 확인 : " + lunchList);





    }
}
