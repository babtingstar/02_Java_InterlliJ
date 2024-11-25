package com.kh.dto;
// 과자 정보를 젖아하고 저장된 정보를 전달하는 역할
public class 과자 {
    private String name;
    private int price;
    private String flavor;

    public 과자() {
    }

    public 과자(String name, int price, String flavor) {
        this.name = name;
        this.price = price;
        this.flavor = flavor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return "과자{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", flavor='" + flavor + '\'' +
                '}';
    }
}
