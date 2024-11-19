package variable.practice;

public class CastingPractice3 { // 기능 제공용 클래스
    public static void main(String[] args) {
        int iNum1 = 10;
        int iNum2 = 4;
        float fNum = 3.0f;
        double dNum = 2.5;
        char ch = 'A';
        System.out.println(iNum1 % iNum2); // 2
        System.out.println((int)dNum); // 2
        System.out.println( iNum2*dNum ); // 10.0
        System.out.println( (float)iNum1 ); // 10.0 // 소수점 밑 7자리까지인데 왜 10.000000 표기가 아니지
        System.out.println( iNum1/(float)iNum2 ); // 2.5
        System.out.println( dNum ); // 2.5
        System.out.println( (int)fNum ); // 3
        System.out.println( iNum1/(int)fNum ); // 3
        System.out.println( iNum1/fNum ); // 3
        System.out.println( iNum1/fNum );// 3.3333333
        System.out.println( (double)iNum1/fNum ); // 3.3333333333333335
        System.out.println( ch ); // 'A'
        System.out.println( (int)ch ); // 65
        System.out.println( (int)ch+iNum1 ); // 75
        System.out.println( (char)(ch+iNum1) ); // 'K' ch+iNUm1 부분에서 ch는 자동으로 int 로 변환됨
    }
}