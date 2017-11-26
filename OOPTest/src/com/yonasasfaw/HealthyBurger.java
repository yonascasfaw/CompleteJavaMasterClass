package com.yonasasfaw;

/**
 * Created by yonas on 11/25/2017.
 */
public class HealthyBurger extends BasicBurger {
    private boolean broccoli = false;
    private boolean garlic = false;

    public HealthyBurger(String meat) {
        super("Brown rye roll", meat);
        this.price = 14;
    }

    public int additions(boolean lettuce, boolean tomato, boolean pickles, boolean grilledOnions, boolean broccoli,
                         boolean garlic) {
        super.additions(lettuce, tomato, pickles, grilledOnions);
        if(broccoli)
            System.out.println("Broccoli has been added.");
        if(garlic)
            System.out.println("Garlic has been added.");
        return 1;
    }

    @Override
    public double price() {
        super.price();
        if(this.broccoli)
            price += 5;
        if(this.garlic)
            price += 6;
        return price;
    }

    @Override
    public int order() {
        if(this.broccoli)
            System.out.println("You have added broccoli for " + 5 + " dollars.");
        if(true)
            System.out.println("You have added garlic for " + 6 + " dollars.");
        super.order();
        System.out.println("Total price of the healthy burger is " + price());

        return 1;
    }
}
