package com.yonasasfaw;

/**
 * Created by yonas on 11/25/2017.
 */
public class DeluxeHamburger extends BasicBurger {
    private boolean drinks;
    private boolean chips;

    public DeluxeHamburger(String rollType, String meat) {
        super(rollType, meat);
        this.drinks = true;
        this.chips = true;
        this.price = 15;
    }

    @Override
    public int additions(boolean lettuce, boolean tomato, boolean pickles, boolean grilledOnions) {
        System.out.println("sorry no add-ons are allowed on the deluxe burger.");
        return super.additions(false,false,false,false);
    }

    @Override
    public double price() {
        this.price = 15;
        return this.price;
    }

    @Override
    public int order() {
        System.out.println("you have ordered the deluxe burger which comes with chips and drink");
        System.out.println("your total is 15 dollars");
        return 1;
    }
}
