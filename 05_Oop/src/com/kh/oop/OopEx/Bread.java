package com.kh.oop.OopEx;

public class Bread {
    private String breadName;
    private int breadPrice;
    private int quantity;

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public void setBreadPrice(int breadPrice) {
        this.breadPrice = breadPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBreadName() {
        return breadName;
    }

    public int getBreadPrice() {
        return breadPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Bread() {
    }

    // 부분적으로 값을 넣어야 할 경우에는 set을 이용해서 값을 저장
    public Bread(String breadName, int breadPrice, int quantity) {
        this.breadName = breadName;
        this.breadPrice = breadPrice;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "breadName='" + breadName + '\'' +
                ", breadPrice=" + breadPrice +
                ", quantity=" + quantity +
                '}';
    }
}

