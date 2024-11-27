package com.kh.CollectionEx.listPre;

import java.util.ArrayList;
import java.util.HashSet;

public class DrinkService {
    private ArrayList<Drink> drinks = new ArrayList<>();
//Drink d = new Drink();

    public void addDrink(Drink drinkInput) {

        if (drinks.contains(drinkInput)) {
            System.out.println("이미 추가된 음료입니다 : " + drinkInput.getName());
        } else {
            drinks.add(drinkInput);
            System.out.print(drinkInput.getName() + " - 음료가 추가되었습니다.");
        }

    }

    public void allDrinks() {
        if (!drinks.isEmpty()) {
            for (Drink drink : drinks) {
                System.out.println(drink.getName());
            }
        } else {
            System.out.print("추가된 음료가 없습니다.");
        }

    }

    public void searchDrink(String searchName) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getName().equals(searchName)) {
                System.out.println(drinks.get(i).getName());
            }
        }

    }

    public void searchDrink(int searchPrice) {

    }

    public void deleteDrink(String deleteName) {
        boolean flag = true;
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getName().equals(deleteName)) {
                drinks.remove(i);
                System.out.println("해당 음료를 삭제했습니다.");
                flag = false;
            }
            if (flag) {
                System.out.println("해당 음료를 찾을 수 없습니다.");
            }

        }

    }
}
