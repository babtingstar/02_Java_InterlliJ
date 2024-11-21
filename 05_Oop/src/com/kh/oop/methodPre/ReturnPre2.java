package com.kh.oop.methodPre;

public class ReturnPre2 {
    public String method1(String name, int age) {
        return "안녕하세요 ! 제 이름은 " + name + "이고, 나이는 " + age + "세 입니다.";
    }

    public int method2(int num1, int num2) {
        int bigger = 0;
        if (num1 > num2) {
            bigger = num1;
        } else if (num1 < num2) {
            bigger = num2;
        }
        return bigger;
    }

    public char method3(int point) {
        if (point >= 90) {
            return 'A';
        } else if (point >= 80) {
            return 'B';
        } else if (point >= 70) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public int method4(int num1, int num2) {
        return num1 * (1 - num2 / 100);
    }

    public double method5(int[] array) {
        int total = 0;
        for (int j : array) {
            total += j;
        }
        return (double) total / (array.length);
    }

    public String method6(int age) {
        if (age > 19) {
            return "성인입니다.";
        } else {
            return "미성년자입니다.";
        }
    }

    public String method7(String str1, String str2) {
        return str1 + str2;
    }

    public boolean method8(String[] array, String match) {
        boolean flag = false;
        for (String str : array) {
            if (str.equals(match)) {
                flag = true;
                break; // 이거 안넣어도?
            }
        }
        return flag;
    }

    public double method9(double radius) {
        return Math.PI * radius * radius;
    }

}
