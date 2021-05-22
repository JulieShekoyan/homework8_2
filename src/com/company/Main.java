package com.company;

public class Main {

    public static void main(String[] args) {
        Store store = new Store(11, "Mango", "8555465123", 452);
        store.sell(store.getProductNumber());
        System.out.println(store.getProductNumber());
    }
}
