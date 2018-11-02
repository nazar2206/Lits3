package com.lits;



public class AppleOrder implements Order {
    int price = 5;
    int quantity = 10;
    public int calculateTotalPrice() {
        return price * quantity;
    }
}
