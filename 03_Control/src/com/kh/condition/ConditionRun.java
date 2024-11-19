package com.kh.condition;

public class ConditionRun {
    // main 기능으로 ConditionEx에 작성한 기능 불러오기를 한 다음에 실행
    public static void main(String[] args) {
        ConditionEx c = new ConditionEx();

        //c.나이확인();
        // 주석하고자 하는 코드들 드래고 + Ctrl / 하면 한번에 주석
//        c.scannerAge();
//        c.methodAage();
//        c.methodMonth();
        c.changeMonth();
    }
}
