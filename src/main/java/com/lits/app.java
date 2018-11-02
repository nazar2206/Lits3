package com.lits;

import java.sql.SQLOutput;

public class app {
    public static void main(String args[]){
        Food food = new Food();
        Food food1 = new Food(5, 10);
        Food food2 = new Food(15,20,25);


        AppleOrder apor = new AppleOrder();
        System.out.println(apor.calculateTotalPrice());
        PizzaOrder pior = new PizzaOrder();
        System.out.println(pior.calculateTotalPrice());
        System.out.println();

        Person person = new Person();
        person.sleep();
        person.sleep(45);
        person.sleep(4, "hours");
        System.out.println();

        Body body = new Body();
        Body body1 = new Body();
        System.out.println(body.equals(body1));
        System.out.println(body1.hashCode());

    }
}
