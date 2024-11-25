package com.kh.service;

import com.kh.dto.학생;

// 기능 제공 클래스 : 입력 출력 빼고 나머지 모두 작성
// if for 를 이용해 데이터를 가공, 저장
// 기존 예제에서 저장, 추가, 삭제, 수정 기능을 서비스라는 패키지에 따로 빼서 작성함

public class 학생서비스 {

    private 학생 s1; // dto에 만든 학생을 참조 자료형으로 사용해서 학생에 등록된 정보를 저장

    public void 학생추가하기(String studentNumber, String studentName, char gender){
        s1 = new 학생(studentNumber, studentName, gender);
    }

    public 학생 getS1(){
        return s1;
    }
}
