package com.kh.oop.methodex;

public class 게터와세터예제 {
    private int age;

    // Alt + Insert

    //세터 = 값 저장 = 추후에 @Setter라는 이름으로 요약해서 사용
    public void setAge(int age) {
        /* setter 에 값을 저장할 때 유효성 검사와 같은 if문 넣지 않음
        if(age<=0){System.out.println("string");}
         */
        this.age = age;
    }

    //게터 = 값 전달 = 추후 @Getter라는 이름으로 요약해서 사용
    public int getAge() {
        return age;
    }
}
