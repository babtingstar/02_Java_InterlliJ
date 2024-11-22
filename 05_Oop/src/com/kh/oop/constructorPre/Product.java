package com.kh.oop.constructorPre;

public class Product {
    private String pName = "Product Name";
    private int price = 1500;
    private String brand = "Brand";

    public Product() {
    }

    public void information(){
        System.out.println("이름 : " + pName);
        System.out.println("가격 : " + price);
        System.out.println("브랜드 : " + brand);
    }
}
