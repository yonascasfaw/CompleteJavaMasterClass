package com.yonasasfaw;

public class Fridge {
    private String brand;
    private Dimensions dimensions;
    private Capacity capacity;
    private int doorNumber;
    private String color;

    public Fridge(String brand, Dimensions dimensions, Capacity capacity, int doorNumber, String color) {
        this.brand = brand;
        this.dimensions = dimensions;
        this.capacity = capacity;
        this.doorNumber = doorNumber;
        this.color = color;
    }

    public void makeSomePops(){
        System.out.println("then at stove");
        System.out.println("Get your popsicles while they're still cold!!");
    }

    public String getBrand() {
        return brand;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public String getColor() {
        return color;
    }
}
