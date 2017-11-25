package com.yonasasfaw;

public class Main {

    public static void main(String[] args) {
        BasicBurger burger = new BasicBurger("sour dough", "Well done");
        System.out.println("the price of your basic burger is " + burger.price());
        //burger.order();
        burger.additions(true,true,false,true);
        burger.order();


    }
}
