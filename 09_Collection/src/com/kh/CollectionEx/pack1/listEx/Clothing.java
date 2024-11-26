package com.kh.CollectionEx.pack1.listEx;

public class Clothing {
    private String name;
    private String category;
    private int price;

    public Clothing() {
    }

    public Clothing(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "옷이름 : " + name +
                ", 카테고리 : " + category +
                ", 옷 가격 : " + price + "원";
    }
}