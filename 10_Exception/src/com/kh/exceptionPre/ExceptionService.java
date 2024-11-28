package com.kh.exceptionPre;

public class ExceptionService {

    public void method1(){
        String name1 = "감길자";
        int health1 = 50; // 체력점수 50/100

        String name2 = "영길동";
        int health2 = 80;

        try {
            // 감길자 홍길동의 평균 체력 계산

            System.out.println(name1 + " 와 " + name2 + "의 평균 체력을 계산합니다. ");

            // 문제가 발생할 수 있는 코드

            int avgHealth = (health1 + health2) / 0;
            System.out.println(avgHealth);
            //Exception in thread "main" java.lang.ArithmeticException: / by zero
            //	at com.kh.exceptionPre.ExceptionService.method1(ExceptionService.java:18)
            //	at com.kh.exceptionPre.ExceptionServiceRun.main(ExceptionServiceRun.java:6)

        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // 발생한 문제를 출력문으로 확인
            System.out.println("/0 issue");
        }
        catch (Exception e) { // 문제의 원인을 예상할 수 없을 때 작성, 보통 맨 마지막에 작성
            System.out.println(e.getMessage()); // 발생한 문제를 출력문으로 확인
            System.out.println("unpredictable issue");
        }




    }

    public void method2(){
        try {
            int arr[] = {1,2,3,4,5};
            for(int i=0;i<=arr.length;i++){
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
