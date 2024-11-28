package com.kh.exceptionPre;

import java.util.Scanner;

public class ExScanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter number 1 : ");
            int num1 = sc.nextInt();

            System.out.println("Enter number 2 : ");
            int num2 = sc.nextInt();

            int divide = num1 / num2;
            System.out.println("The divide is : " + divide);
        } catch (ArithmeticException e) {
            System.out.println("Exception" + e);
            System.out.println("Arithmetic Exception");
        } catch (Exception e) {
            System.out.println("Exception " + e);
            System.out.println("Unknown Exception");
        }

    }
}
