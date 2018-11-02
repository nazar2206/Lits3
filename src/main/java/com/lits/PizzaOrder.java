package com.lits;

public class PizzaOrder implements Order {
   int prise, weight;

    public int calculateTotalPrice() {
        return prise * weight;
    }
}
