package com.yonasasfaw;

public class BasicBurger {
    private String rollType;
    private String meat;
    public double price;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean pickles = false;
    private boolean grilledOnions = false;

    public BasicBurger(String rollType, String meat) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = 10.0;
    }

    public int order(){
        //show the order and the price and the add-ons
        System.out.println("Your burger's base price is " + this.price);
        if(this.lettuce)
            System.out.println("You have added lettuce for " + 1 + " dollar.");
        if(this.tomato)
            System.out.println("You have added tomato for " + 2 + " dollars.");
        if(this.pickles)
            System.out.println("You have added pickles for " + 3 + " dollars.");
        if(this.grilledOnions)
            System.out.println("You have added grilled onions for " + 4 + " dollars.");
        System.out.println("Total price of the burger is " + price());
        return 1;


    }

    public int additions(boolean lettuce, boolean tomato, boolean pickles, boolean grilledOnions){
        this.lettuce = lettuce;
        if(this.lettuce)
            System.out.println("Lettuce has been added");
        this.tomato = tomato;
        if(this.tomato)
            System.out.println("Tomato has been added");
        this.pickles = pickles;
        if(this.pickles)
            System.out.println("Pickles have been added");
        this.grilledOnions = grilledOnions;
        if(this.grilledOnions)
            System.out.println("Grilled onions have been added");
        return 1;
    }

    public double price(){
        if(this.lettuce)
            price += 1;
        if(this.tomato)
            price += 2;
        if(this.pickles)
            price += 3;
        if(this.grilledOnions)
            price += 4;
        return price;
    }

}
