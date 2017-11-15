package com.yonasasfaw;

public class Sink {
    private Dimensions dimensions;
    private String color;
    private int number;
    private boolean incinerator;

    public Sink(Dimensions dimensions, String color, int number, boolean incinerator) {
        this.dimensions = dimensions;
        this.color = color;
        this.number = number;
        this.incinerator = incinerator;
    }

    public void washPlates(){
        System.out.println("Don't forget to clean up your plates.");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public boolean isIncinerator() {
        return incinerator;
    }
}
