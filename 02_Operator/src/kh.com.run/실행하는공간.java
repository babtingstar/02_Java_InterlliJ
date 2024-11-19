package kh.com.run;
import kh.com.ex.OperatorEx;

public class 실행하는공간 {
    //OperatorEx로 만든 기능들중에서 원하는 기능만 선택해서 실행하는 공간
    public static void main(String[] args) {

        //매번 new OperatorEx();를 붙여주는것은 가독성이 떨어지기 때문에
        //ex 라는 변수명에 new OperatorEx()를 담아서 사용할 것
        //new OperatorEx().삼의배수기능();
        OperatorEx ex = new OperatorEx();

        // kh.com.ex.OperatorEx kh.com.ex 폴더 밑에 작성된 OperatorEx 파일을 가져와서
        // 파일 안에 public void 기능명칭() {} 으로 작성된 기능들 중에서
        // 원하는 기능만 선택해서 최종으로 사용하겠다
        // 원하는 기능은 개발자가 원하는만큼 사용할 수 있고, 기능 만든 후에 사용을 안해도 됨
        ex.삼의배수가맞는지확인하는기능();
        ex.이의배수가맞는지확인하는기능();
    }
}
