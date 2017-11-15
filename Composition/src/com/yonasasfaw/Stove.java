package com.yonasasfaw;

public class Stove {
    private int grillnumber;
    private String color;
    private String brand;
    private Dimensions dimensions;

    public Stove(int grillnumber, String color, String brand, Dimensions dimensions) {
        this.grillnumber = grillnumber;
        this.color = color;
        this.brand = brand;
        this.dimensions = dimensions;
    }

    public void startCooking(){
        System.out.println("Im all fired up now!!!");
    }

    public int getGrillnumber() {
        return grillnumber;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
