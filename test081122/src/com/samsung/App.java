package com.samsung;

import com.samsung.model.Pet;
import com.samsung.model.Product;

public class App {
    public static void main(String[] args) {
        Pet[] arr = new Pet[3];
        arr[0] = new Pet(
                "Пельмень",
                "Человек",
                "Кошка"
        );
        arr[1] = new Pet(
                "Антон",
                "Точно не человек",
                "Рыба"
        );
        arr[2] = new Pet(
                "Глеб",
                "Кошка",
                "Собака"
        );
        for (Pet i : arr) {
            System.out.println(i);
        }
    }
}
