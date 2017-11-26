package com.yonasasfaw;

public class Main {

    public static void main(String[] args) {
        BasicBurger burger = new BasicBurger("sour dough", "Well done");
        System.out.println("the price of your basic burger is " + burger.price());
        //burger.order();
        burger.additions(true,true,false,true);
        burger.order();
        System.out.println("********************************");
        HealthyBurger healthyBurger = new HealthyBurger("well done");
        System.out.println("the price of your Healthy burger is " + healthyBurger.price());
        healthyBurger.additions(true,true,false,true,false,true);
        healthyBurger.order();
        System.out.println("***************************");
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("white bread", "medium rare");
        deluxeHamburger.additions(true,false,false,true);
        System.out.println("your burger price is " + deluxeHamburger.price() + "dollars");
        deluxeHamburger.order();




    }
}
