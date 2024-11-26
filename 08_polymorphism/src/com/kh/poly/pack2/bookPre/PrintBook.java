package com.kh.poly.pack2.bookPre;

public class PrintBook extends Book {
    private int shippingCost;

    public PrintBook() {
        super();
    }

    public PrintBook(String title, String author, int price, int shippingCost) {
        super(title, author, price);
        this.shippingCost = shippingCost;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return "PrintBook{" +
                "shippingCost=" + shippingCost +
                '}';
    }
}
