package com.yonasasfaw;

public class ElectricCar extends Car {

    private double mpw;

    public ElectricCar(String name, String color, double speed, int gears, String steering,
                        int tireNumber, int doorNumber, int seatNumber, double mpw) {
        super(name, color, speed, gears, steering, tireNumber, doorNumber, seatNumber);
        this.mpw = mpw;
    }
}
