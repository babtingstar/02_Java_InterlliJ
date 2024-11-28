package com.kh.exceptionEx;

/*
Exception : 코드로 처리 가능한 에러
Exception Handling : 예외처리. 예외 발생 시 처리하는 구문
 */

public class ExceptionService {

    // 의도적으로 문제 발생시킨 method
    public void method1(){
        int[] arr = {1,2,3,4,5}; // index : 4

        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }

//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//        at com.kh.exceptionEx.ExceptionService.method1(ExceptionService.java:15)
//        at com.kh.exceptionEx.ExceptionServiceRun.main(ExceptionServiceRun.java:6)


    }

    // try - catch 를 이용해 발생한 문제의 유연한 처리
    public void method2(){
        int[] arr = {1,2,3,4,5};

        try{for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }}
        catch(Exception e){
            System.out.println("error");
            //문제가 생겼을 때 유연하게 처리함과 동시에 문제의 원인을 가시적으로 파악
        }


    }


}
