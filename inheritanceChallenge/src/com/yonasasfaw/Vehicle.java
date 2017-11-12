package com.yonasasfaw;

public class Vehicle {

    private String name;
    private String color;
    private double speed;

    public Vehicle(String name, String color, double speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public void moving(){
        System.out.println("The Vehicle is now moving at " + this.speed + " mph.");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

}
