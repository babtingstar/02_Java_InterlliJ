package com.kh.oop.constructor;

public class Snack {
    private String name;
    private int cost;
    private String taste;

    public Snack() {
    }

    public Snack(String name, int cost, String taste) {
        this.name = name;
        this.cost = cost;
        this.taste = taste;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", taste='" + taste + '\'' +
                '}';
    }
}
