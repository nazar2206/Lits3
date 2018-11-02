package com.lits;

public class Food {
    int prise, weight, quantity;


    public Food(){
        int prise,weight, quantity;

    }

    public Food(int prise, int quantity) {
        this.prise = prise;
        this.quantity = quantity;
    }

    public Food(int weight, int prise, int quantity) {
        this.weight = weight;
        this.prise = prise;
        this.quantity = quantity;
    }
}
