package kh.com.ex;

public class 비교 {
    /*
    .equals()
        String 으로 비교한 문자열의 내용(값)이 같은 지 비교하는 기능
        문자열의 값이 동일하면 true 반환

    ==
    두 객체가 같은 메모리 주소를 참조하고 있는지 비교
    두 문자열 객체가 같은 메모리에 저장되어 있지 안핟면
    값이 같더라도 false 를 반환할 수 있음

    .equalsIgnoreCase()
        대소문자를 구분하지 않고 문자열을 비교하는 메서드
        사용 예제 : 사용자사 yes, YES, Yes 를 입력해도 동일하게 처리할 때

        String a = "Hello";
        String b = "hello";

        a.equalsIgnoreCase(b); // true
        b.equalsIgnoreCase("hi"); // false

                    ┌>문자열 내용이 대소문자 구분 없이 일치로 간주
        .equals() .equalsIgnoreCase()
          └> 문자의 내용이 대소문자까지 정확히 일치해야함

     */
}
