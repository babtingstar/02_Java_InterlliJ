package com.kh.oop.lombokPre;

import lombok.Getter; // lombok 에서 만든 기능들 가져오기
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor // lombok 에서 만든 기능들 사용하기
@NoArgsConstructor
@Setter
public class Person {

    private String name;
    private int age;

    /*
    import lombok.Setter : lombok 이라는 폴더 밑에 만들어진 Setter 기능을 가져와서 사용

    @Setter : 클래스 밑에 작성된 필드 명에 걸맞는 set 메서드들을 @Setter 이름을 활용해서 대신 모두 생성

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        ths.age = age;
    }

     */
}
